// Last updated: 15/02/2026, 08:08:04
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        int max=-999;
4        for(int i:bulbs) max=Math.max(max,i);
5        int arr[]=new int[max+1];
6        for(int i:bulbs) arr[i]=arr[i]^1;
7        List<Integer>ans=new ArrayList<>();
8        for(int i=0;i<arr.length;i++)
9            if(arr[i]!=0)
10                ans.add(i);
11        return ans;
12    }
13}