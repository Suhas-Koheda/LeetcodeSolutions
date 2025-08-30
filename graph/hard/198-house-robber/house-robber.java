class Solution {
    public int rob(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        int max=-999999;
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1){
                take+=arr[i-2];
            }
            int nottake=arr[i-1];
            arr[i]=Math.max(take,nottake);
        }
        return arr[nums.length-1];
    }
}