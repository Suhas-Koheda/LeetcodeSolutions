// Last updated: 02/01/2026, 10:07:47
class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> h=new HashSet<>();
        for(Character c:s.toCharArray()){
            h.add(c);
        }
        int count=0;
        for(Character c:h){
            int i=-1,j=0;

            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==c){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }
            Set<Character> ans =new HashSet<>();
            for(int k=i+1;k<j;k++){
                ans.add(s.charAt(k));
            }
            count+=ans.size();
        }
        return count;
    }
}