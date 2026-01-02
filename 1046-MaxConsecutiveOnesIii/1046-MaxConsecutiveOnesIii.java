// Last updated: 02/01/2026, 10:08:42
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength=0;
        int r=0,l=0;int n=nums.length;
        int zeroes=0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[l]==0){
                zeroes--;
            }
            l++;
            }
            if(zeroes<=k){
                maxLength=Math.max(maxLength,r-l+1);
            }
            r++;
        }
        return maxLength;
    }
}