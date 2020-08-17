'''
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
'''

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        seen = Counter(nums)
        for i in seen.keys():
            if seen[i] == 1:
                return i