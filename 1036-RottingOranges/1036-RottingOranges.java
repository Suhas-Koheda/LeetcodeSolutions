// Last updated: 02/01/2026, 10:08:43
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int rowDir[]={-1,0,1,0};
        int colDir[]={0,1,0,-1};
        Queue<Data> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Data(i,j,0));
                    vis[i][j]=2;
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            Data d=q.poll();
            time=Math.max(time,d.time);
            for(int i=0;i<4;i++){
                int nRow=d.x+rowDir[i];
                int nCol=d.y+colDir[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]==1 && !(vis[nRow][nCol]==2)){
                    q.add(new Data(nRow,nCol,d.time+1));
                    vis[nRow][nCol]=2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !(vis[i][j]==2)){
                    return -1;
                }
            }
        }
        return time;
    }
}

class Data {
    int x;
    int y;
    int time;
    public Data(int x, int y, int time){
        this.x=x;
        this.y=y;
        this.time=time;
    }
}