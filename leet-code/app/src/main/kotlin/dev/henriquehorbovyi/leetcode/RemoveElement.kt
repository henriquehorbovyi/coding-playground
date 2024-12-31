package dev.henriquehorbovyi.leetcode

fun removeElement(nums: IntArray, v: Int): Int {
	val arr = arrayListOf<Int>()
	var k = 0

	nums.forEach {
		if (it != v) {
			arr.add(it)
			k++
		}
	}
	arr.forEachIndexed { i, e -> nums[i] = e }
	return k
}

fun main() {
	val k = removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2)
	println(k)
}