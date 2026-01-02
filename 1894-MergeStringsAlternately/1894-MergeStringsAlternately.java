// Last updated: 02/01/2026, 10:07:57
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder out=new StringBuilder();
        int k=0;
        if(word1.length()==word2.length()){
            int i=0;
            while(i<word1.length()){
                out.append(word1.charAt(i));
                out.append(word2.charAt(i++));
            }
        }
        else if(word1.length()<word2.length()){
            int i=0;
            while(i<word1.length()){
                out.append(word1.charAt(i));
                out.append(word2.charAt(i++));
            }
            while(i<word2.length()){
                out.append(word2.charAt(i++));
            }
        }
        else {
            int i=0;
            while(i<word2.length()){
                out.append(word1.charAt(i));
                out.append(word2.charAt(i++));
            }
            while(i<word1.length()){
                out.append(word1.charAt(i++));
            }
        }
        return out.toString();
    }
}