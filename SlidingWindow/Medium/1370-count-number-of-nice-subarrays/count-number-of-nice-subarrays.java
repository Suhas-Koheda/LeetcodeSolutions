class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }

    int check(int[] nums,int k){
        int r=0,l=0,odd=0,count=0;
        while(r<nums.length){
            if(checkOdd(nums[r])){
                odd++;
            }
            while(odd>k){
                if(checkOdd(nums[l])){
                    odd--;
                }
                    l++;
            }
            
                count=count+r-l+1;
            
            r++;
        }
        return count;
    }

    boolean checkOdd(int k){
        return (k&1)==1;
    }
}