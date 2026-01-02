// Last updated: 02/01/2026, 10:10:42
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> l=new ArrayList<>();
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        int left[]=new int[n];
        int upDiag[]=new int[2*n-1];
        int loDiag[]=new int[2*n-1];
        solve(0,board,left,upDiag,loDiag,l);
        return l;
    }

    void solve(int col,char[][] board, int[]left,int[]upDiag,int[] loDiag,List<List<String>> l){
        if(col==board.length){
            List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        l.add(res);
        }
        for(int row=0;row<board.length;row++){
            if(left[row]==0 && loDiag[row+col]==0 && upDiag[board.length-1+col-row] ==0){
                board[row][col]='Q';
                left[row]=1;
                loDiag[row+col]=1;
                upDiag[board.length-1+col-row]=1;
                solve(col+1,board,left,upDiag,loDiag,l);
                board[row][col]='.';
                left[row]=0;
                loDiag[row+col]=0;
                upDiag[board.length-1+col-row]=0;
            }
        }
    }
}