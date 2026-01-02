// Last updated: 02/01/2026, 10:06:50
class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char i : s.toCharArray()) {
            if (Character.isAlphabetic(i)) {
                result.append(i);
            } else if (Character.isDigit(i) && result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        
        return result.toString();
    }
}
