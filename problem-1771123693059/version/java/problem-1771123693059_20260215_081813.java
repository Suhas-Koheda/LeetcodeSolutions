// Last updated: 15/02/2026, 08:18:13
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer,Integer> h1=new HashMap<>();
4        for(int i:nums){
5            h1.put(i,h1.getOrDefault(i,0)+1);
6        }
7        HashMap<Integer,Integer> freqs=new HashMap<>();
8        for(int i:h1.values()){
9            freqs.put(i,freqs.getOrDefault(i,0)+1);
10        }
11        for(int i:nums) 
12            if(freqs.get(h1.get(i))==1)
13                return i;
14        return -1;
15    }
16}