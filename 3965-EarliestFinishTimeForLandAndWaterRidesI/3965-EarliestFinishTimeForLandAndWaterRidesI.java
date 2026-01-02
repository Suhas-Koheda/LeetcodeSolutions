// Last updated: 02/01/2026, 10:06:32
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;

        int last=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int land=landStartTime[i];
            int time=landDuration[i];
            for(int j=0;j<m;j++){
                int water=waterStartTime[j];
                int wTime=waterDuration[j];
                int wl=Math.max(land+time,water);
                int finish=wl+wTime;
                int lw=Math.max(water+wTime,land);
                int wFinish=lw+time;
                last=Math.min(last,Math.min(finish,wFinish));
            }
        }
        return last;
    }
}