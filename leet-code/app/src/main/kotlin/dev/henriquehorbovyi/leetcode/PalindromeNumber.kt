package dev.henriquehorbovyi.leetcode

fun isPalindrome(x: Int): Boolean {
    return x.toString() == x.toString().reversed()
}
