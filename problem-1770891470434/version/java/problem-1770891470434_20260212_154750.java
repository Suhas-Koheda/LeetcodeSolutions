// Last updated: 12/02/2026, 15:47:50
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        
6        int suffixSum = 0;
7        for (int num : nums) {
8            suffixSum += num;
9        }
10        
11        for (int i = 0; i < n - 1; i++) {
12            suffixSum -= nums[i]; 
13            
14            double avg = (double) suffixSum / (n - i - 1);
15            
16            if (nums[i] > avg) {
17                count++;
18            }
19        }
20        
21        return count;
22    }
23}
24