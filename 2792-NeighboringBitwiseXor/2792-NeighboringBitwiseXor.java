// Last updated: 02/01/2026, 10:07:03
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x=0;
        for(int i:derived){
            x^=i;
        }
        return x==0;
    }
}