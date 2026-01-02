// Last updated: 02/01/2026, 10:06:57
class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        var freq=IntArray((grid.size*grid.size)+1);
        for(i in grid.indices){
            for(j in grid[i].indices){
                freq[grid[i][j]]++;
            }
        }
        var arr=IntArray(2);
        for (i in 1..(grid.size * grid.size)) {
            if (freq[i] == 0) {
                arr[1] = i  
            }
            if (freq[i] == 2) {
                arr[0] = i  
            }
        }  
        return arr;
    }
}