// Last updated: 02/01/2026, 10:08:02
class Solution {
    fun constructDistancedSequence(n: Int): IntArray {
        var bool = BooleanArray(n+1);
        val seq = IntArray(2*n-1);
        backtrack(seq,bool,n,0);
        return seq;
    }
    fun backtrack(seq:IntArray,bool:BooleanArray,n:Int,idx:Int):Boolean{
        var i = idx
        while (i < seq.size && seq[i] != 0) {
            i++
        }
        if(i==seq.size){
            return true;
        }
        for(j in n downTo 1){
            if(bool[j]){
                continue;
            }
            if(j==1){
                seq[i]=j;
                bool[j]=true;
                if(backtrack(seq,bool,n,i+1)){
                    return true;
                }
                seq[i]=0;
                bool[j]=false;
            }
            else if(i+j<seq.size && seq[i+j]==0){
                seq[i]=j;
                seq[i+j]=j;
                bool[j]=true;
                if(backtrack(seq,bool,n,i+1)){
                    return true;
                }
                seq[i]=0;
                seq[i+j]=0;
                bool[j]=false; 
            }
        }
        return false;
    }
}