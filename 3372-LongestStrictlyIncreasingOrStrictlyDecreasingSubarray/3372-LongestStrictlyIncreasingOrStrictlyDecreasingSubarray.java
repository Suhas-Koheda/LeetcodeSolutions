// Last updated: 02/01/2026, 10:06:54
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                inc++;
            }
            else{
                inc=1;
            }
            if(nums[i-1]>nums[i]){
                dec++;
            }
            else{
                dec=1;
            }
            int temp=Math.max(inc,dec);
            longest=Math.max(temp,longest);
        }
        return longest;
    }
}