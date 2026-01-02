# Last updated: 02/01/2026, 10:10:29
class Solution(object):
    def lengthOfLastWord(self, s):
        ss=s.split()
        l=len(ss[-1])
        return(l)