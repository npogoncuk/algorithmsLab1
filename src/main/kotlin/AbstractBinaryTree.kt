private const val DEPTH_COEFFICIENT = 10

abstract class AbstractBinaryTree {
    protected var root: Node? = null

    fun showTree() {
        fun show(current: Node?, spaces: Int) {
            if (current == null) return

            val _spaces = spaces + DEPTH_COEFFICIENT

            show(current.right, _spaces)
            println()
            println(" ".repeat(spaces) + current.data)
            println()
            show(current.left, _spaces)

        }
        show(root, 0)
    }
}