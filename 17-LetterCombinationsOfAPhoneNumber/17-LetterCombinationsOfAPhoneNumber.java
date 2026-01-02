// Last updated: 02/01/2026, 10:11:05
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        List<String> l=new ArrayList<>();
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits,map,l,new StringBuilder(),0);
        return l;
    }

    void solve(String digits,String[] map,List<String> l,StringBuilder ds,int i){
        if(i==digits.length()){
            l.add(new String(ds.toString()));
            return;
        }
        int x=digits.charAt(i)-'0';
        String d=map[x];
        for(int j=0;j<d.length();j++){
            ds.append(d.charAt(j));
            solve(digits,map,l,ds,i+1);
            ds.deleteCharAt(ds.length()-1);
        }
    }
}