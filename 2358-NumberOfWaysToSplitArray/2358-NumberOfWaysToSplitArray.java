// Last updated: 02/01/2026, 10:07:30
class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long left=0,right=0;
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right-=nums[i];
            if(left>=right){
                count++;
            }
        }
        return count;
    }
}