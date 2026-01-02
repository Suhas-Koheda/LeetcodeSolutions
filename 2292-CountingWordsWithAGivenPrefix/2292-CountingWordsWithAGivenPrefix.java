// Last updated: 02/01/2026, 10:07:34
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String i : words){
            if(i.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}