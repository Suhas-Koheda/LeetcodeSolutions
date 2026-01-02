// Last updated: 02/01/2026, 10:09:26
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int count=1;
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=last){
                count++;
                last=intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}