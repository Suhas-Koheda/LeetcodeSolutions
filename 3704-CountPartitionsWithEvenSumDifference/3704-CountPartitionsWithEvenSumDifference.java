// Last updated: 02/01/2026, 10:06:43
class Solution {
    public int countPartitions(int[] nums) {
        int i=1;
        int lSum=0,rSum=0,n=nums.length;
        for(int k=0;k<n;k++){
            rSum+=nums[k];
        }
        int count=0;
        while(i<n){
            if(i==0)continue;
            rSum-=nums[i];
            lSum+=nums[i];
            if(Math.abs(rSum-lSum)%2==0){
                count++;
            }
            i++;
        }
        return count;
    }
}