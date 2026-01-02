// Last updated: 02/01/2026, 10:06:30
class Solution {
    public int longestBalanced(String s) {
        int maxi=0;
         for(int i=0;i<s.length();i++){
            Map<Character,Integer> h=new HashMap<>();
             for(int j=i;j<s.length();j++){
                 int k=j;
                h.put(s.charAt(k),h.getOrDefault(s.charAt(k),0)+1);
                 if (isBalanced(h)) {
                    maxi = Math.max(maxi, j - i + 1);
                }
             }
         }
        return maxi;
    }
    private boolean isBalanced(Map<Character, Integer> freq) {
        Set<Integer> counts = new HashSet<>(freq.values());
        return counts.size() == 1;
    }
}