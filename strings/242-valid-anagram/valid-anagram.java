class Solution {
    public boolean isAnagram(String s, String t) {
        int hash[]=new int[257];
        int hash1[]=new int[257];
        for(char i:s.toCharArray()){
            hash[i]++;
        }
        for(char i:t.toCharArray()){
            hash1[i]++;
        }
        for(int i=0;i<257;i++){
            if(hash[i]!=hash1[i])return false;
        }
        return true;
    }
}