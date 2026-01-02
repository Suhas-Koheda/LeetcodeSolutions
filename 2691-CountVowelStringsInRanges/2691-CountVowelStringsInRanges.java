// Last updated: 02/01/2026, 10:07:07
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        boolean[] isVowel = new boolean[26];
        for (char c : "aeiou".toCharArray()) {
            isVowel[c - 'a'] = true;
        }

        int[] prefixSum = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel[word.charAt(0) - 'a'] && isVowel[word.charAt(word.length() - 1) - 'a']) {
                prefixSum[i + 1] = 1;
            }
            prefixSum[i + 1] += prefixSum[i];
        }

        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int start = queries[j][0];
            int end = queries[j][1];
            result[j] = prefixSum[end + 1] - prefixSum[start];
        }

        return result;
    }
}
