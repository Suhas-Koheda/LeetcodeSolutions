// Last updated: 02/01/2026, 10:08:10
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0,rSum=0,maxSum=0;
        int rI=cardPoints.length-1;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        maxSum=lSum;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[rI--];
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}