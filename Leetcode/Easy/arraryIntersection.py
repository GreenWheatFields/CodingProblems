''''
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]'
'''

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
    seen = set()
    result = []
    biggest, smallest = (nums1, nums2) if len(nums1) >= len(nums2) else (nums2, nums1)
    
    for i in biggest:
    seen.add(i)
    
    for i in smallest:
    if i in seen:
        result.append(i)
        seen.remove(i)
    return result
    
        
    