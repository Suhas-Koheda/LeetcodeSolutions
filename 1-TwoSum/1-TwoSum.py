# Last updated: 02/01/2026, 10:11:25
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        i=0
        l=[]
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if(i!=j and nums[i]+nums[j]==target):
                    return[i,j]
        return