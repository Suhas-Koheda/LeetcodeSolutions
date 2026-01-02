// Last updated: 02/01/2026, 10:09:06
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int s=0,end=arr.length-1;
        while(s<=end){
            int m=s+(end-s/2);
            if(target<arr[m]) {//in case of descending ordered array
				end=m-1;		//changes to start=middle+1;
			}
			else  {
				s=m+1;		//changes to end=middle-1;
            }
        }
        return arr[s%arr.length];
    }
}