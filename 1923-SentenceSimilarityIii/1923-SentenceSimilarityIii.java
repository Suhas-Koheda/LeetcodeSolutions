// Last updated: 02/01/2026, 10:07:52
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if (words1.length < words2.length) {
            return checkSimilarity(words1, words2);
        } else {
            return checkSimilarity(words2, words1);
        }
    }

    private boolean checkSimilarity(String[] shorter, String[] longer) {
        int start = 0, end = 0;

        while (start < shorter.length && shorter[start].equals(longer[start])) {
            start++;
        }

        while (end < shorter.length && shorter[shorter.length - 1 - end].equals(longer[longer.length - 1 - end])) {
            end++;
        }

        return start + end >= shorter.length;
    }
}
