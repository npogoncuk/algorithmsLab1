class BinaryTree : AbstractBinaryTree() {
    fun generateTree(numberOfNodes: Int) {
        var counter = 0
        fun generate(numberOfNodes: Int): Node? {
            if (numberOfNodes <= 0) return null
            val current = Node(++counter)
            current.left = generate(numberOfNodes / 2)
            current.right = generate(numberOfNodes - numberOfNodes / 2 - 1)
            return current
        }
        root = generate(numberOfNodes)
    }

    fun showInPrefixOrder() {
        fun prefixOrder(current: Node?) {
            current ?: return
            print(current.data.toString() + " ")
            prefixOrder(current.left)
            prefixOrder(current.right)
        }
        prefixOrder(root)
        println()
    }

    fun showInPostfixOrder() {
        fun postfixOrder(current: Node?) {
            current ?: return
            postfixOrder(current.left)
            postfixOrder(current.right)
            print(current.data.toString() + " ")
        }
        postfixOrder(root)
        println()
    }

    fun showInInfixOrder() {
        fun infixOrder(current: Node?) {
            current ?: return
            infixOrder(current.left)
            print(current.data.toString() + " ")
            infixOrder(current.right)
        }
        infixOrder(root)
        println()
    }
}