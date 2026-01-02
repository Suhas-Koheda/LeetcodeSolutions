// Last updated: 02/01/2026, 10:07:02
class Solution {
    public int minLength(String s) {
        return check(s).length();
    }
    public String check(String s){
        while (s.contains("AB") || s.contains("CD")) {
        s=s.replace("AB","").replace("CD","");
        }
        return s;
    }
}