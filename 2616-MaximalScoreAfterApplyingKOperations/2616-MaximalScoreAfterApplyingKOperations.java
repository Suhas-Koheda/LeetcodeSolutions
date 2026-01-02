// Last updated: 02/01/2026, 10:07:10
class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            int val = q.poll();
            int y = (int)Math.ceil((double)val / (double)3);
            q.add(y);
            sum = sum + val;
        }
        return sum;
    }
}