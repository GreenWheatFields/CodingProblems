'''
Runtime: 80 ms, faster than 66.44% of Python3 online submissions for Minimum Size Subarray Sum.
Memory Usage: 16.1 MB, less than 97.73% of Python3 online submissions for Minimum Size Subarray Sum.
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
'''
class Solution:
    def minSubArrayLen(self, s: int, nums: List[int]) -> int:
        left = right = sum = 0
        answer = float("inf")
        while right < len(nums):
            sum += nums[right]
            while sum >= s:
                if (right - left) + 1 < answer:
                    answer = (right - left) + 1
                sum -= nums[left]
                left += 1
            right += 1
        return answer if answer != float("inf") else 0