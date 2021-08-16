fun String.createEncoding(): HuffmanEncoding =
    createEncoding(charAndFrequency())

fun String.encode(encoding: HuffmanEncoding) =
    map { char -> encoding.codeByChar[char] }.joinToString("")

fun String.decode(encoding: HuffmanEncoding): String {
    var result = ""
    var chars = this.toList()
    var node = encoding.tree
    while (chars.isNotEmpty()) {
        node = node.followCode(chars.first())!!
        chars = chars.subList(1, chars.size)
        if (node.char != null) {
            result += node.char
            node = encoding.tree
        }
    }
    return result
}

fun String.charAndFrequency(): Map<Char, Int> =
    toCharArray().groupBy { it }.map { Pair(it.key, it.value.size) }.toMap()

fun createEncoding(frequencyByChar: Map<Char, Int>): HuffmanEncoding {
    val tree = buildTree(frequencyByChar.map { Node(it.value, it.key) })
    val codeByChar = tree.leavesWithPath().toMap()
    return HuffmanEncoding(tree, codeByChar)
}

fun buildTree(nodes: List<Node>): Node {
    return if (nodes.size == 1) {
        nodes.first()
    } else {
        val sortedNodes = nodes.sortedBy { it.weight }
        val node = Node(sortedNodes[0].weight + sortedNodes[1].weight, null, sortedNodes[0], sortedNodes[1])
        buildTree(sortedNodes.drop(2) + node)
    }
}


data class HuffmanEncoding(val tree: Node, val codeByChar: Map<Char, String>)


data class Node(val weight: Int, val char: Char?, val left: Node? = null, val right: Node? = null) {
    fun leavesWithPath(): List<Pair<Char, String>> =
        if (left == null && right == null) listOf(Pair(char!!, ""))
        else (left?.leavesWithPath()?.map { Pair(it.first, "0" + it.second) } ?: emptyList()) +
                (right?.leavesWithPath()?.map { Pair(it.first, "1" + it.second) } ?: emptyList())

    fun followCode(code: Char): Node? =
        when (code) {
            '0'  -> left
            '1'  -> right
            else -> throw IllegalStateException("Unexpected code '$code'")
        }

    override fun toString(): String {
        var s = "Node($weight"
        if (char != null) s += ", '$char'"
        if (left != null && right != null) s += ", $left, $right"
        return "$s)"
    }
}