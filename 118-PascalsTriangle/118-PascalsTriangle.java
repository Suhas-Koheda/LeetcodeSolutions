// Last updated: 02/01/2026, 10:10:08
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> first=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> second = new ArrayList<>();
            for (int j=1; j<=i;j++) {
                second.add(nCr(i - 1,j - 1));
            }
            first.add(second);
        }
        return first;
    }
    public static int nCr(int n,int r){
        long k=1;
        for(int i=0;i<r;i++){
            k=k*(n-i);
            k=k/(i+1);
        }
        return (int) k;
    } 
}