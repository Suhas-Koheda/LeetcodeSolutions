// Last updated: 02/01/2026, 10:06:28
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int hash[]=new int[1000000];
        for(int i:nums){hash[i]++;}
        int sum=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]%k==0){
                sum+=i*hash[i];
            }
        }
        return sum;
    }
}