// Last updated: 02/01/2026, 10:08:09
class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean bool[][] = new boolean[numCourses][numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            bool[prerequisites[i][0]][prerequisites[i][1]] = true;
        }

        boolean result[] = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int s = 0; s < numCourses; s++) {
                for (int d = 0; d < numCourses; d++) {
                    bool[s][d] = bool[s][d] || (bool[s][i] && bool[i][d]);
                }
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            ans.add(bool[queries[i][0]][queries[i][1]]);
        }
        return ans;
    }
}