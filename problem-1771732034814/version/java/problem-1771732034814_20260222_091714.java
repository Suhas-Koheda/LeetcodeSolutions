// Last updated: 22/02/2026, 09:17:14
1class Solution {
2    public int countSequences(int[] nums, long k) {
3        return solve(nums, 0, 1.0, k,new HashMap<>());
4    }
5    
6    public int solve(int nums[], int idx, double current, long k,HashMap<String,Integer> memo) {
7        if (idx == nums.length) {
8            if (Math.abs(current - k) < 1e-9) {
9                return 1;
10            }
11            return 0;
12        }
13        String key = idx + "," + String.format("%.9f", current);
14        if (memo.containsKey(key)) return memo.get(key);
15        int val = 0;
16        val += solve(nums, idx + 1, current * nums[idx], k,memo);
17        if (nums[idx] != 0) {
18            val += solve(nums, idx + 1, current / nums[idx], k,memo);
19        }
20        val += solve(nums, idx + 1, current, k,memo);
21        memo.put(key, val);
22        return val;
23    }
24}