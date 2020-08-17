'''
You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
'''
class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        toCompare = Counter([[i] for i in words])
        print(compare)
        #fill before iteration
        seen = Counter()
        left = 0
        ans = []
        for right in range(0, len(s)):
            if len(seen) == len(toCompare):
                if toCompare == seen:
                    ans.append(left)
                seen.remove(s[left])
                left += 1
                continue
            else:
                seen.append(s[right])
        return ans
                