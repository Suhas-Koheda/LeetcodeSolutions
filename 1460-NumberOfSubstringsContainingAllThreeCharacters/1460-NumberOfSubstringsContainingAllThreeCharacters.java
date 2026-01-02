// Last updated: 02/01/2026, 10:08:20
class Solution {
    public int numberOfSubstrings(String s) {
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=-1;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1&&arr[1]!=-1&&arr[2]!=-1){
                count=count+(Math.min(arr[2],Math.min(arr[0],arr[1])))+1;
            }
        }
        return count;
    }
}