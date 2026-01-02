// Last updated: 02/01/2026, 10:09:01
class Solution {
    public boolean rotateString(String s, String goal) {
        for(int x=0;x<s.length();x++){
            if(!(s.substring(x)+s.substring(0,x)).equals(goal)) continue;
            else return true;
        }
        return false;
    }
}