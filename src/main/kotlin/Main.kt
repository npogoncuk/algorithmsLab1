fun main() {
//    val bt = BinaryTree()
//    with(bt) {
//        generateTree(15)
//        showTree()
//        showInPrefixOrder()
//        showInPostfixOrder()
//        showInInfixOrder()
//    }

    val bst = BinarySearchTree()
    with(bst) {
        addNode(8)
        addNode(3)
        addNode(10)
        addNode(1)
        addNode(14)
        addNode(6)
        showTree()
        delete(3)
        showTree()
    }

}