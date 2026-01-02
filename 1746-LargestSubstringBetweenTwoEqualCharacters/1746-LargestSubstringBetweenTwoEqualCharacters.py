# Last updated: 02/01/2026, 10:08:03
import re
class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        first_occurrence = {}
        max_length = -1
        
        for i in range(len(s)):
            char = s[i]
            if char not in first_occurrence:
                first_occurrence[char] = i
            else:
                max_length = max(max_length, i - first_occurrence[char] - 1)
        
        return max_length
