// Last updated: 02/01/2026, 10:07:11
class Solution {
    fun maximumCount(nums: IntArray): Int {
       var pos=0;
       var neg=0;
       for(num in nums){
        when {
            num>0 -> pos++;
            num<0 -> neg++;
        }
       }
       return Math.max(pos,neg)
    }
}