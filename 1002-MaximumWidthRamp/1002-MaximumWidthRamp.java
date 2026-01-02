// Last updated: 02/01/2026, 10:08:44
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++){
            if(s.isEmpty() || nums[s.peek()]>nums[i]){
                s.push(i);
            }
        }
        int r=0;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                r=Math.max(r,i-s.peek());
                s.pop();
            }
        }
        return r;
    }  
}