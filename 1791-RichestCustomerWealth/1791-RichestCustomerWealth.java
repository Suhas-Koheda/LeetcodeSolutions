// Last updated: 02/01/2026, 10:08:01
class Solution {
    public int maximumWealth(int[][] accounts) {
        return max(accounts);
    }
    int max(int [][]arr){
        int maxx=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[i].length;j++){
                c=c+arr[i][j];
            }
            System.out.println(c);
            if(c>maxx){
                maxx=c;
            }
        }
        return maxx;
    }
}