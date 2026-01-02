// Last updated: 02/01/2026, 10:06:25
class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        // int max=-1,min=99999;
        // for(int i:nums){
        //     if(i>max) max=i;
        //     if(i<min) min=i;
        // }
        // return max-min+1;
        int max=-1;
        for(int i:nums){
            if(i>max)max=i;
        }
        // System.out.println(max);
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]<max){
                nums[i]++;
                count++;
                // System.out.println(Arrays.toString(nums));
            }
        }
        return count;
    }
}