class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l =new ArrayList<>();
        solve(nums,0,l,new ArrayList<>());
        return l;
    }
    void solve(int[] nums,int i, List<List<Integer>> l,List<Integer> ds){
        if(i==nums.length){
            if( !l.contains(ds)){
            l.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(nums[i]);
        solve(nums,i+1,l,ds);
        ds.remove(ds.size()-1);
        solve(nums,i+1,l,ds);
    }
}