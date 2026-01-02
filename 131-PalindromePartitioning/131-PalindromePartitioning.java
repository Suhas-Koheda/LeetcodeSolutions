// Last updated: 02/01/2026, 10:09:59
class Solution {
    public List<List<String>> partition(String s) { 
        List<List<String>> l =new ArrayList<>();
        if(s.length()==0){
            return l;
        }
        solve(l,new ArrayList<>(),s,0);
        return l;
    }

    void solve(List<List<String>>l,List<String> ds,String s, int i){
        if(i==s.length() ){
            l.add(new ArrayList<>(ds));
            return;
        }
        for(int index=i;index<s.length();index++){
            if(checkP(s,i,index)){
                ds.add(s.substring(i,index+1));
        solve(l,ds,s,index+1);
        ds.remove(ds.size()-1);
            }
        }
    }
    boolean checkP(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}