package dev.henriquehorbovyi.leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0..<nums.size - 1) {
        for (j in i + 1..<nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}
