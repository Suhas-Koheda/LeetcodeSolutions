// Last updated: 02/01/2026, 10:07:04
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        int op[]=new int[A.length];
        int k=0;
        for(int i=0;i<A.length;i++){
            int count=0;
            map1.put(A[i],1);
            map2.put(B[i],1);
            for(Integer j : map1.keySet()){
                if(map2.keySet().contains(j)){
                    count++;
                }
            }
            op[k++]=count;
        }
        return op;
    }
}