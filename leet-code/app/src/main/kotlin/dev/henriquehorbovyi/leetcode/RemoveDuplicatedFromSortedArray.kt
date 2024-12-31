package dev.henriquehorbovyi.leetcode

fun removeDuplicates(nums: IntArray): Int {
	val nonDuplicated = mutableSetOf<Int>()
	var k = 0
	for (i in nums.indices) {
		nonDuplicated.add(nums[i])
	}

	for (i in nonDuplicated.indices) {
		nums[i] = nonDuplicated.elementAt(i)
		k++
	}

	return k
}

fun main() {
	val n = removeDuplicates(intArrayOf(0, 0, 0, 1, 1, 2, 3, 44, 44, 44))
	println()
	println(n)
}
