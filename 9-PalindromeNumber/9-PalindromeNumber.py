# Last updated: 02/01/2026, 10:11:16
class Solution:
    def isPalindrome(self, x: int) -> bool:
        return(str(x)==str(x)[::-1])
            