// Last updated: 02/01/2026, 10:07:25
class Solution {
    fun smallestNumber(pattern: String): String {
        val n = pattern.length
        val used = BooleanArray(10)
        val result = StringBuilder()
        backtrack(pattern, 0, IntArray(n + 1), used, result)
        return result.toString()
    }

    private fun backtrack(pattern: String, index: Int, num: IntArray, used: BooleanArray, result: StringBuilder): Boolean {
        if (index > pattern.length) {
            for (i in num.indices) {
                result.append(num[i])
            }
            return true // Found the valid lexicographically smallest number
        }

        for (digit in 1..9) {
            if (!used[digit] && (index == 0 || isValid(num[index - 1], digit, pattern[index - 1]))) {
                used[digit] = true
                num[index] = digit
                if (backtrack(pattern, index + 1, num, used, result)) {
                    return true
                }
                num[index] = 0
                used[digit] = false // Backtrack
            }
        }
        return false
    }

    private fun isValid(lastDigit: Int, currentDigit: Int, condition: Char): Boolean {
        return (condition == 'I' && lastDigit < currentDigit) || (condition == 'D' && lastDigit > currentDigit)
    }
}
