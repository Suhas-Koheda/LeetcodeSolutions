// Last updated: 02/01/2026, 10:09:44
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l=new ArrayList<>();
        solve(l,new ArrayList<>(),1,k,n);
        return l;
    }
    void solve(List<List<Integer>> l,List<Integer>ds,int i,int k,int n){
            System.out.println(ds+ " "+n+" "+k);
        if(n==0 && ds.size()==k){
                l.add(new ArrayList<>(ds));
            return;
        }
        if (ds.size() > k || n < 0 || i > 9) {
            return;
        }
        ds.add(i);
        solve(l,ds,i+1,k,n-i);
        ds.remove(ds.size()-1);
        solve(l,ds,i+1,k,n);
    }
}