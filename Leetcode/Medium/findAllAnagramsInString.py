'''
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter
'''
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        toCompare = Counter(p)
        foundCharacters = Counter(s[0:len(p)])
        left = 0
        ans = []
        for right in range(len(p), len(s) + 1):
            if foundCharacters == toCompare:
                ans.append(left)
            if right == len(s):
                break
            foundCharacters.update(s[right])
            foundCharacters.subtract(s[left])
            if foundCharacters[s[left]] == 0:
                del foundCharacters[s[left]]
            left += 1
        return ans if len(ans) > 0 else ""