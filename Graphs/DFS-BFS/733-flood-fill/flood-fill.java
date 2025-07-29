class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int vis[][]=new int[n][m];
        int rowDir[]={-1,0,1,0};
        int colDir[]={0,1,0,-1};
        Queue<int[]> q=new LinkedList<>();
        int intialColor=image[sr][sc];
        vis[sr][sc]=color;
        q.add(new int[]{sr,sc});
        while(!q.isEmpty()){
            int arr[]=q.poll();
            for(int i=0;i<4;i++){
                int nRow=arr[0]+rowDir[i];
                int nCol=arr[1]+colDir[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && image[nRow][nCol]==intialColor && !(vis[nRow][nCol]==color)){
                    q.add(new int[]{nRow,nCol});
                    vis[nRow][nCol]=color;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!(vis[i][j]==color)){
                    vis[i][j]=image[i][j];
                }
            }
        }
        return vis;
    }
}