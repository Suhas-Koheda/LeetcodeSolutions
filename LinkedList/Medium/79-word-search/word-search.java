class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(idx)==board[i][j]){
                    if(search(board,idx,word,i,j,m,n)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean search(char[][] board, int idx,String word,int row,int col, int tr, int tc){
        if(idx==word.length()){
            return true;
        }

        if(row<0 || col<0 || row==tr || col==tc || word.charAt(idx)!=board[row][col] || board[row][col]=='#'){
            return false;
        }

        char c=board[row][col];
        board[row][col]='#';

        boolean top=search(board,idx+1,word,row-1,col,tr,tc);
        boolean bottom=search(board,idx+1,word,row+1,col,tr,tc);
        boolean right=search(board,idx+1,word,row,col+1,tr,tc);
        boolean left=search(board,idx+1,word,row,col-1,tr,tc);

        board[row][col]=c;

        return top || bottom || right|| left ;
    }

}