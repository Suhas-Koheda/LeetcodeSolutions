// Last updated: 02/01/2026, 10:07:00
class Solution {
    fun punishmentNumber(n: Int): Int {
        var res:Int=0;
        for(i in 1..n){
            var dp=Array((i*i).toString().length){IntArray(i+1)}
            for(k in dp.indices){
                dp[k].fill(-1);
            }
        if (isPartition(0, (i * i).toString(), i, 0,dp)) {
            res+=(i*i);
        }
        }
        return res;
    }
    fun isPartition(j:Int, j2:String,target:Int,cSum:Int,dp:Array<IntArray>):Boolean{
        if(j==j2.length){
            return (cSum==target)
        }
        if(cSum>target){
            return false
        }
        if(dp[j][cSum]!=-1){
           if( dp[j][cSum]==1){
                return true;
            }
            else{
                return false;
            }
        }
        for(k in j until j2.length){
            var value:Int =j2.substring(j,k+1).toInt();
            if(isPartition(k+1,j2,target,cSum+value,dp)){
                dp[j][cSum]=1;
                return true;
            }
        }
        dp[j][cSum]=0;
        return false;
    }
}