'''
Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.

Runtime: 52 ms, faster than 95.11% of Python3 online submissions for Find Lucky Integer in an Array.
Memory Usage: 13.9 MB, less than 26.92% of Python3 online submissions for Find Lucky Integer in an Array.
'''
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        numCounter = Counter(arr)
        ans = -1
        for i in numCounter.keys():
            if numCounter[i] == i:
                ans = i if i > ans else ans
        return ans
