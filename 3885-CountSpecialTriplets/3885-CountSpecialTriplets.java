// Last updated: 02/01/2026, 10:06:36
class Solution {
    public int specialTriplets(int[] nums) {
        final int mod=1000000007;
        Map<Integer,Integer> counts=new HashMap<>();
        Map<Integer,Integer> partial=new HashMap<>();
        for(int i:nums) counts.put(i,counts.getOrDefault(i,0)+1);
        long ans=0;
        for(int i:nums){
            int find=i*2;
            int left=partial.getOrDefault(find,0);
            partial.put(i,partial.getOrDefault(i,0)+1);
            int right=counts.getOrDefault(find,0)-partial.getOrDefault(find,0);
            ans=(ans+(long)left*right)%mod;
        }
        return (int) ans;
    }
}