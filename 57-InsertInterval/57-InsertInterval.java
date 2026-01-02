// Last updated: 02/01/2026, 10:10:30
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            arr.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        arr.add(newInterval);
        while(i<intervals.length){
            arr.add(intervals[i]);
            i++;
        }
        int[][] ans=new int[arr.size()][2];
        int k=0;
        for(int []m:arr){
            ans[k++]=m;
        }
        return ans;
    }
}