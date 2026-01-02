// Last updated: 02/01/2026, 10:08:07
class Solution {
    fun numOfSubarrays(arr: IntArray): Int {
        val MOD = 1000000007
var odd = 0
var even = 1
var result = 0
var sum = 0

for (i in arr.indices) {val MOD = 1000000007
var odd = 0
var even = 1
var result = 0
var sum = 0

for (i in arr.indices) {
    sum += arr[i]
    if (sum % 2 == 1) {
        result = (result + even) % MOD
        odd++
    } else {
        result = (result + odd) % MOD
        even++
    }
}

return result

    sum += arr[i]
    if (sum % 2 == 1) {
        result = (result + even) % MOD
        odd++
    } else {
        result = (result + odd) % MOD
        even++
    }
}

return result
    }
}