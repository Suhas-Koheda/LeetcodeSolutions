// Last updated: 02/01/2026, 10:07:19
class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] start=new int[n];
        int[] end =new int[n];
        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int k=0,l=0;
        for(int i=0;i<n;i++){
            if(start[i]>end[k]){
                k++;
            }
            else{
                l++;
            }
        }
        return l;
    }
}