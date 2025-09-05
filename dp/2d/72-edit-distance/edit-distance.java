class Solution {
    public int minDistance(String word1, String word2) {
        return changes(word1,word2);
    }
    int changes(String text1,String text2){
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for (int rows[] : dp)Arrays.fill(rows, -1);
        for (int i = 0; i <= text1.length(); i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= text2.length(); j++) {
            dp[0][j] = j;
        }
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}