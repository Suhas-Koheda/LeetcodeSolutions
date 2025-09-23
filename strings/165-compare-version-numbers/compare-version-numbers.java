class Solution {
    public int compareVersion(String version1, String version2) {
        String s[] = version1.split("\\.");
        String s1[] = version2.split("\\.");
        
        int maxLength = Math.max(s.length, s1.length);
        for (int i = 0; i < maxLength; i++) {
            int m = (i < s.length) ? Integer.parseInt(s[i]) : 0;
            int n = (i < s1.length) ? Integer.parseInt(s1[i]) : 0;
            if(m<n) return -1;
            if(m>n) return 1;
            if(m==n) continue;
        }
        return 0;
    }
}