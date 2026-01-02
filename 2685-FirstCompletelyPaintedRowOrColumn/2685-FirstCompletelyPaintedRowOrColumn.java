// Last updated: 02/01/2026, 10:07:08
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        Map<Integer,int[]> data=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                data.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] rowArray=new int[r];
        int[] colArray=new int[c];
        for(int i=0;i<arr.length;i++){
            int[] gett=data.get(arr[i]);
            rowArray[gett[0]]++;
            colArray[gett[1]]++;
            if(rowArray[gett[0]]==c || colArray[gett[1]]==r)
            return i;
        }
        return arr.length-1;
    }
}