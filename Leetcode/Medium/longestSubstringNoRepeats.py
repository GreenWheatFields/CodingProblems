'''
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3.
continous substring
'''
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        left = ans = 0
        for right in range(0, len(s)):
            if s[right] in seen:
                while s[right] in seen:
                    if s[left] in seen:
                        seen.remove(s[left])
                    left += 1
            seen.update(s[right])
            ans = len(seen) if len(seen) > ans else ans
        return ans