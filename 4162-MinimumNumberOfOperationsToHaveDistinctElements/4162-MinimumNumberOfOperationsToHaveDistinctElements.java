// Last updated: 02/01/2026, 10:06:27
class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int last=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(nums[i])){
                last=i;
                break;
            }
            set.add(nums[i]);
        }
        if(last==-1) return 0;
        return (last/3)+1;
    }
}