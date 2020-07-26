'''
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
'''
class Solution:
    def minSubArrayLen(self, s: int, nums: List[int]) -> int:
    left = 0
    right = len(nums)
    sum = nums[left]
    answer = 0
    while left < right:
        while sum >= s:
            sum -= nums[left]
            left += 1
        answer = len(nums[left - 1:right])
        sum += nums[right]
        right += 1
        
        