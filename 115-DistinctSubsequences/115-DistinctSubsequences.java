// Last updated: 02/01/2026, 10:10:10
class Solution {
    public int numDistinct(String s, String t) {
        return LCS(s,t);
    }
    int LCS(String text1,String text2){
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        for (int i = 0; i <= text1.length(); i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= text2.length(); j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]+dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}