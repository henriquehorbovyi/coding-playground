package dev.henriquehorbovyi.leetcode

fun strStr(haystack: String, needle: String): Int {
//	if (needle.isBlank()) return 0
//
//	outerloop@for (i in 0 .. haystack.length - needle.length) {
//		if (haystack[i] != needle[0]) continue@outerloop
//
//		for (j in 0 ..< needle.length) {
//			if (haystack[i + j] != needle[j]) continue@outerloop
//		}
//		return i
//	}
//
//	return -1

	return haystack.indexOf(needle)
}

fun main() {
	val subIndex = strStr("bbstadutsad", "sad")
	println(subIndex)
}