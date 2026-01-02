// Last updated: 02/01/2026, 10:09:47
class Solution {
    public int rob(int[] nums) {
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    int n=nums.length;
    if(n==1)
       return nums[0];
    
    for(int i=0; i<n; i++){
        if(i!=0) arr1.add(nums[i]);
        if(i!=n-1) arr2.add(nums[i]);
    }
    
    long ans1 = func(arr1);
    long ans2 = func(arr2);
    
    return (int)Math.max(ans1,ans2);        
    }

    public int func(ArrayList<Integer> nums){
        int prev=nums.get(0);
        int prev2=0;
        int curr=prev;
        for(int i=1;i<nums.size();i++){
            int take=nums.get(i);
            if(i>1){
                take+=prev2;
            }
            int nottake=prev;
            curr=Math.max(take,nottake);
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
}