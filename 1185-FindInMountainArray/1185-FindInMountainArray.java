// Last updated: 02/01/2026, 10:08:32
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public  int findInMountainArray(int target, MountainArray mountainArr) {
       int start=0;
    int end=mountainArr.length()-1;
    while(start<=end) {
    	int middle=(start+end)/2;
    	if(mountainArr.get(middle)<mountainArr.get(middle+1)) {
    		start=middle+1;
    	}
    	else {
    		end=middle-1;
    	}
    }
    int x=check( mountainArr,0, end,target,true);
    int y=check( mountainArr,start,mountainArr.length()-1,target,false);
    if(x==-1){
        return y;
    }
    return x;
}    
public int check(MountainArray mountainArr,int start,int end,int target,boolean y){
    	while(start<=end) {
		int middle=start+(end-start)/2;
        int j=mountainArr.get(middle);
			if(target<j) {
                if(y){
				end=middle-1;}
                    else{
                        start=middle+1;
                    }
                }
			
			else if(target>j) {
                if(y){
				start=middle+1;		}
                else{
                    end=middle-1;	
                }
			}
			else  {
				return middle;
			}
        }
        return-1;
}
}