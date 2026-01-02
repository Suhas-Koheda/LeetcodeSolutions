// Last updated: 02/01/2026, 10:07:51
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                max=Math.max(sum,max);
                sum=nums[i];
            }
        }
        return Math.max(sum,max);
    }
}