// Last updated: 02/01/2026, 10:08:00
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r=isWater.length;
        int c=isWater[0].length;
        int res [][] =new int[r][c];
        int[][] dir={{0,-1},{0,1},{-1,0},{1,0}};
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(isWater[i][j]==1){
                    res[i][j]=0;
                    q.offer(new int[]{i,j});
                }
                else{
                    res[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int cell[]=q.poll();
            int cr=cell[0];
            int cc=cell[1];
            int h=res[cr][cc];
            for(int i=0;i<4;i++){
                int nr=cr+dir[i][0];
                int nc=cc+dir[i][1];
                if(isValid(nr,nc,r,c) && res[nr][nc]==-1){
                    res[nr][nc]=h+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return res;
    }
    boolean isValid(int r,int c,int tr,int tc){
        return r>=0 && c>=0 && r<tr && c<tc;
    }
}