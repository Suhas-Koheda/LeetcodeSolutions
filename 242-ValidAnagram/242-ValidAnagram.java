// Last updated: 02/01/2026, 10:09:38
class Solution {
    public boolean isAnagram(String s, String t) {
        int hash[]=new int[256];
        int hash1[]=new int[256];
        for(char i:s.toCharArray()){
            hash[i]++;
        }
        for(char i:t.toCharArray()){
            hash1[i]++;
        }
        for(int i=0;i<256;i++){
            if(hash[i]!=hash1[i])return false;
        }
        return true;
    }
}