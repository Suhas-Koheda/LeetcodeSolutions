// Last updated: 02/01/2026, 10:08:11
class Solution {
    public int maxScore(String s) {
        int ones=0;
        int z=0;
        int oc=0;
        int sc=-1;
        for(char i: s.toCharArray()){
            if(i=='1'){
                ones++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                z++;
            }
            else{
                oc++;
            }
            int cs=z+(ones-oc);
            sc=Math.max(sc,cs);
        }
        return sc;
    }
}