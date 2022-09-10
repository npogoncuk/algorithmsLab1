class BinarySearchTree {

    private var root: Node? = null

    private fun searchNode(data: Int): Node? {
        fun searchNode(current: Node?): Node? {
            current ?: return null
            return current.data.let {
                when {
                    it == data -> current
                    it > data -> searchNode(current.left)
                    else -> searchNode(current.right)
                }
            }
        }
        return searchNode(root)
    }

    fun addNode(data: Int) {
        if (searchNode(data) != null) throw IllegalArgumentException("The key already was created")
        if (root == null) {
            root = Node(data)
            return
        }
        fun add(current: Node) {
            if (current.data > data) {
                if (current.left == null) {
                    current.left = Node(data)
                    return
                } else add(current.left!!)
            } else {
                if (current.right == null) {
                    current.right = Node(data)
                    return
                } else add(current.right!!)
            }
        }
        add(root!!)
    }

    fun delete(data: Int) {
        fun delete(current: Node?, data: Int): Node? {
            current ?: return null
            if (data < current.data) {
                current.left = delete(current.left, data)
            } else {
                if (data > current.data) current.right = delete(current.right, data)
                else {
                    if (current.left == null) return current.right
                    else if (current.right == null) return current.left
                    //two children
                    current.data = getMax(current.left)!!
                    current.left = delete(current.left, current.data)
                }
            }
            return current
        }
        root = delete(root, data)
    }

    private fun getMin(current: Node?): Int? {
        current ?: return null
        var node = current
        while (node!!.left != null) node = node.left
        return node.data
    }
    private fun getMax(current: Node?): Int? {
        current ?: return null
        var node = current
        while (node!!.right != null) node = node.right
        return node.data
    }

    fun showTree() {
        fun show(current: Node?, spaces: Int) {
            if (current == null) return

            val _spaces = spaces + 10

            show(current.right, _spaces)
            println()
            println(" ".repeat(spaces) + current.data)
            println()
            show(current.left, _spaces)

        }
        show(root, 0)
    }
}