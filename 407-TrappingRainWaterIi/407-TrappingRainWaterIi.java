// Last updated: 02/01/2026, 10:09:29
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int[][] dir={{0,-1},{0,1},{-1,0},{1,0}};
        int r=heightMap.length;
        int c=heightMap[0].length;
        if(r<3 || c<3){
            return 0;
        }
        int totalUnvisitedols=r*c;
        boolean[][]visited=new boolean[r][c];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->(a[0]-b[0])); //to store the Height Row Column and then visit all the cells

        for(int i=0;i<r;i++){
            pq.offer(new int[]{heightMap[i][0],i,0});
            pq.offer(new int[]{heightMap[i][c-1],i,c-1});
            visited[i][0]=true;
            visited[i][c-1]=true;
        }
        for(int i=0;i<c;i++){
            pq.offer(new int[]{heightMap[0][i],0,i});
            pq.offer(new int[]{heightMap[r-1][i],r-1,i});
            visited[0][i]=true;
            visited[r-1][i]=true;            
        }
        int ans=0;
        int currentlvl=0;
        while(!pq.isEmpty() && totalUnvisitedols>0){
            int[] curr=pq.poll();
            int currh=curr[0];
            int currr=curr[1];
            int currc=curr[2];
            currentlvl=Math.max(currentlvl,currh);

            for(int j=0;j<4;j++){
                int neighbourr=currr+dir[j][0];
                int neighbourc=currc+dir[j][1];
                if(isValid(neighbourr,neighbourc,r,c) && !visited[neighbourr][neighbourc]){
                    int nh=heightMap[neighbourr][neighbourc];
                    if(nh<currentlvl){
                        ans+=(currentlvl-nh);
                    }
                    pq.offer(new int[]{heightMap[neighbourr][neighbourc], neighbourr, neighbourc});
                    visited[neighbourr][neighbourc]=true;
                    totalUnvisitedols--;
                }
            }
        }
        
        return ans;
    }
    boolean isValid(int r,int c,int tr,int tc){
        return r>=0 && c>=0 && r<tr && c<tc;
    }
}