// Last updated: 02/01/2026, 10:06:33
class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0,q=0;
        while(p<nums.length-1 && nums[p]<nums[p+1]){
            p++;
        }
        q=p;
        while(q<nums.length-1 && nums[q]>nums[q+1]){
            q++;
        }
        int temp=q;
        while(temp<nums.length-1 && nums[temp]<nums[temp+1]){
            temp++;
        }
        if(p==0 || q==p || temp==q || temp!=nums.length-1){
            return false;
        }
        return true;
    }
}