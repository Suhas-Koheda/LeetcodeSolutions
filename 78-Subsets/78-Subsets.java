// Last updated: 02/01/2026, 10:10:17
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        solve(0,nums,new ArrayList(),l);
        System.out.println(nums.length);
        return l;
    }
    void solve(int i,int[] nums,List<Integer> f,List<List<Integer>> l){
       if(i==nums.length){
        l.add(new ArrayList<>(f));
        return;
       }
       f.add(nums[i]);
       solve(i+1,nums,f,l);
       f.remove(f.size()-1);
       solve(i+1,nums,f,l);
    }
}