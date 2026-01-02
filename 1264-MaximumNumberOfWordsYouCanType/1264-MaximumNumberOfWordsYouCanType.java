// Last updated: 02/01/2026, 10:08:30
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int hash[] = new int[26];
        for (char i : brokenLetters.toCharArray())
            hash[i - 'a']++;
        String s[] = text.trim().split(" ");
        int count=0;
        for(String i:s){
            if(canType(i,hash))count++;
        }
        return count;
    }

    boolean canType(String s, int hash[]) {
        for (char i : s.toCharArray()) {
            if (hash[i - 'a'] > 0)
                return false;
        }
        return true;
    }
}