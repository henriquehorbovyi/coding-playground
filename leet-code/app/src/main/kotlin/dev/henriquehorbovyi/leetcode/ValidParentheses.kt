package dev.henriquehorbovyi.leetcode

import java.util.Queue

fun isValid(s: String): Boolean {
	val stack = ArrayDeque<Char>()
	for (c in s) {
		when (c) {
			'{', '[', '(' -> stack.add(c)
			'}' -> if (stack.lastOrNull() == '{') stack.removeLast() else return false
			']' -> if (stack.lastOrNull() == '[') stack.removeLast() else return false
			')' -> if (stack.lastOrNull() == '(') stack.removeLast() else return false
		}
	}

	return stack.isEmpty()
}

fun main() {
	val isValid = isValid("(((([]))))")
	println(isValid)
}

