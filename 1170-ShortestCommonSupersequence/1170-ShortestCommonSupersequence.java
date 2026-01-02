// Last updated: 02/01/2026, 10:08:35
class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return SCS(str1, str2);
    }

    String SCS(String text1, String text2) {
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        for (int i = 0; i <= text1.length(); i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= text2.length(); j++) {
            dp[0][j] = 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                min = Math.min(min, dp[i][j]);
            }
        }
        int n = text1.length();
        int m = text2.length();
        String s1 = text1;
        String s2 = text2;
        int len = dp[n][m];
        int i = n;
        int j = m;

        int index = len - 1;
        String ans = "";

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                ans += s1.charAt(i - 1);
                index--;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                ans += s1.charAt(i - 1);
                i--;
            } else {
                ans += s2.charAt(j - 1);
                j--;
            }
        }

        while (i > 0) {
            ans += s1.charAt(i - 1);
            i--;
        }
        while (j > 0) {
            ans += s2.charAt(j - 1);
            j--;
        }

        String ans2 = new StringBuilder(ans).reverse().toString();

        return ans2;
    }
}