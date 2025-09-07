class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n, 1));
        List<Integer> hash = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i : nums)
            arr.add(i);
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            hash.set(i, i);
            for (int prev_index = 0; prev_index <= i - 1; prev_index++) {
                if (arr.get(i) % arr.get(prev_index) == 0 && 1 + dp.get(prev_index) > dp.get(i)) {
                    dp.set(i, 1 + dp.get(prev_index));
                    hash.set(i, prev_index);
                }
            }
        }
        int ans = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            if (dp.get(i) > ans) {
                ans = dp.get(i);
                lastIndex = i;
            }
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(arr.get(lastIndex));

        while (hash.get(lastIndex) != lastIndex) {
            lastIndex = hash.get(lastIndex);
            temp.add(arr.get(lastIndex));
        }

        Collections.reverse(temp);

        return temp;
    }
}