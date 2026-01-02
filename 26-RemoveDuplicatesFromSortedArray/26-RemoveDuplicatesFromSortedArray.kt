// Last updated: 02/01/2026, 10:10:59
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var current=-101;
        var present=0
        for(i in 0..nums.size-1){
            if(nums[i]!=current){
                current=nums[i];
            }
            else{
                nums[i]=-101
            }
        }
        for(i in 0..nums.size-1){
            if(nums[i]!=-101){
                nums[present++]=nums[i];
            }
        }
        return present;
    }
    fun swap(nums:IntArray,x:Int,y:Int){
        var temp=nums[x]
        nums[x]=nums[y]
        nums[y]=temp
    }
}