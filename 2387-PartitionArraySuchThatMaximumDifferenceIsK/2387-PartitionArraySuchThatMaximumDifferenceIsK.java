// Last updated: 02/01/2026, 10:07:29
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int x=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-x>k){
                count++;
                x=nums[i];
            }
        }
        return count;
    }
}