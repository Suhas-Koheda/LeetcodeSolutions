class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int r=0,l=0,len=0,maxLen=0;
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if( map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            len=r-l+1;
            maxLen=Math.max(len,maxLen);
            r++;
        }
        return maxLen;
    }
}