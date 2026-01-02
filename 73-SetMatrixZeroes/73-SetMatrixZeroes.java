// Last updated: 02/01/2026, 10:10:18
class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        if(matrix[i][k]==0){
                            continue;
                        }
                        else{
                            matrix[i][k]='a';
                        }
                    }
                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]==0){
                            continue;
                        }
                        else{
                        matrix[k][j]='a';
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='a'){
                    matrix[i][j]=0;
                }
            }
        }
    }
}