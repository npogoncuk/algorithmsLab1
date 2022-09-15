fun main() {
    val bt = BinaryTree()
    with(bt) {
        println("Generate BinaryTree")
        generateTree(15)
        println("Show tree")
        showTree()
        println("showInPrefixOrder")
        showInPrefixOrder()
        println("showInPostfixOrder")
        showInPostfixOrder()
        println("showInInfixOrder")
        showInInfixOrder()
    }

    val bst = BinarySearchTree()
    with(bst) {
        println("Adding data")
        addNode(8)
        addNode(3)
        addNode(10)
        addNode(1)
        addNode(14)
        addNode(6)
        println("showTree")
        showTree()
        println("delete")
        delete(3)
        println("showTree")
        showTree()
    }

}