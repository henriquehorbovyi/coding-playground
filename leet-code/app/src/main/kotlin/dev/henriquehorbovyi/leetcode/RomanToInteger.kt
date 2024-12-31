package dev.henriquehorbovyi.leetcode

fun romanToInt(s: String): Int {
    var result = 0
    var latch = 0
    for (i in s.length - 1 downTo 0) {
        val converted = when (s[i]) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalArgumentException("Invalid roman: ${s[i]}")
        }


        if (latch < converted) latch = converted
        if (latch == converted) {
            result += converted
        } else if (latch > converted) {
            result -= converted
        }
    }

    return result
}

fun main() {
    val r = romanToInt("MCMXCIV")
    println(r)
}