// Last updated: 02/01/2026, 10:08:21
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(((int)Math.log10(i)+1)%2==0){
                count++;
            }
        }
        return count;
    }
}