'''
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
Example 1:
Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
'''
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        to_compare = Counter(s1)
        seen = Counter(s2[0:len(s1)])
        left = 0
        for right in range(len(s1), len(s2) + 1):
            if to_compare == seen:
                return True
            elif right == len(s2):
                return False
            else:
                seen.subtract(s2[left])
                if seen[s2[left]] == 0:
                    del seen[s2[left]]
                seen.update(s2[right])
                left += 1
        
        return False