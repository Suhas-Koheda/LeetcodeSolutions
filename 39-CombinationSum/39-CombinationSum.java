// Last updated: 02/01/2026, 10:10:45
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        solve(l,new ArrayList<>(),0,candidates,target);
        return l;
    }

    void solve(List<List<Integer>> l,List<Integer> ds,int i,int[] c, int target){
        if(i==c.length){
            if(target==0){
                l.add(new ArrayList<>(ds));
            }
            return;
        }
        if(c[i]<=target){
            ds.add(c[i]);
            solve(l,ds,i,c,target-c[i]);
            ds.remove(ds.size()-1);
        }
        solve(l,ds,i+1,c,target);
    }
}