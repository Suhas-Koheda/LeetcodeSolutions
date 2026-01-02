// Last updated: 02/01/2026, 10:09:13
import java.util.*;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> combinedList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int num : nums.get(i)) {
                combinedList.add(new int[]{num, i});
            }
        }
        combinedList.sort((a, b) -> Integer.compare(a[0], b[0]));
        int[] counts = new int[nums.size()];
        int uniqueLists = 0;
        int minRange = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        for (int left = 0, right = 0; right < combinedList.size(); right++) {
            if (counts[combinedList.get(right)[1]]++ == 0) {
                uniqueLists++;
            }
            while (uniqueLists == nums.size()) {
                int currentRange = combinedList.get(right)[0] - combinedList.get(left)[0];
                if (currentRange < minRange) {
                    minRange = currentRange;
                    start = combinedList.get(left)[0];
                    end = combinedList.get(right)[0];
                }
                if (--counts[combinedList.get(left)[1]] == 0) {
                    uniqueLists--;
                }
                left++;
            }
        }
        return new int[]{start, end};
    }
}