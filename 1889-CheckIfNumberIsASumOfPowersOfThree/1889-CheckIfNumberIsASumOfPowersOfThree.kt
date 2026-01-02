// Last updated: 02/01/2026, 10:07:58
class Solution {
    fun checkPowersOfThree(n: Int): Boolean {
        var x=n;
    while (x> 0) {
        if (x % 3 > 1) {
            return false
        }
        x /= 3
    }
    return true
    }
}