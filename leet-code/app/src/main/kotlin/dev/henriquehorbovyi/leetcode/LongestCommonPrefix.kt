package dev.henriquehorbovyi.leetcode

fun longestCommonPrefix(a: Array<String>) = buildString {
    a.minByOrNull { it.length }?.forEachIndexed { i, c ->
        if (a.all { it[i] == c }) append(c) else return toString()
    }
}

fun longestCommonPrefixWithTrie(strs: Array<String>): String {
    val trie = Trie().apply { strs.forEach(::insert) }
    val smallestWord = strs.minByOrNull { it.length } ?: ""
    return trie.longestCommonPrefix(smallestWord)
}

class Trie {

    data class Node(
        val children: MutableMap<Char, Node> = mutableMapOf(),
        var isEndOfWord: Boolean = false
    )

    private val root: Node = Node()

    fun insert(word: String) {
        var currentNode = root

        for (char in word) {
            if (currentNode.children[char] == null) {
                currentNode.children[char] = Node()
            }
            currentNode = currentNode.children[char]!!
        }
        currentNode.isEndOfWord = true
    }

    fun longestCommonPrefix(word: String): String {
        var prefix = ""
        var currentNode = root

        for (char in word) {
            val childrenCount = currentNode.children.count()

            if (currentNode.children[char] == null || childrenCount > 1)
                return prefix

            if (childrenCount == 1)
                prefix += "$char"

            currentNode = currentNode.children[char]!!
        }

        return prefix
    }
}

fun main() {
    val prefix = longestCommonPrefix(arrayOf("flow", "fly", "flight"))
    println(prefix)
}
