// Last updated: 02/01/2026, 10:06:24
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[]=new int[1000000];
        for(int i:nums) freq[i]++;
        for(int i=k;i>0;i=i+k){
            if(freq[i]<1){
                return i;
            }
        }
        return -1;
    }
}