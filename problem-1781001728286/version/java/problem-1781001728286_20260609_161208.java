// Last updated: 09/06/2026, 16:12:08
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int sum=0;
4        for(int i=Math.max(0,n-k);i<=n+k;i++){
5            if((n&i)==0) sum+=i;
6        }
7        return sum;
8    }
9}