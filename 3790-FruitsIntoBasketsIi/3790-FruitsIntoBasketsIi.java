// Last updated: 02/01/2026, 10:06:41
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i:fruits){
            int k=1;
            for(int j=0;j<baskets.length;j++){
                if(i<=baskets[j]){
                    baskets[j]=0;
                    k=0;
                    break;
                }
            }
            count+=k;
        }
        return count;
    }
}