'''
Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:

B.length >= 3
There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
(Note that B could be any subarray of A, including the entire array A.)

Given an array A of integers, return the length of the longest mountain. 

Return 0 if there is no mountain.

Example 1:

Input: [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
could be much better
'''
class Solution:
    def longestMountain(self, A: List[int]) -> int:
        left = 0
        right = 0
        ans = 0
        while right < len(A) - 1:
            if A[right] < A[right + 1]:
                left = right
                while right < len(A) - 1 and A[right] < A[right + 1]:
                    right += 1
                if right == len(A) - 1:
                    break
                elif A[right] > A[right + 1]:
                    while right < len(A) - 1 and A[right] > A[right + 1]:
                        right += 1
                    print(left, right)
                    if len(A[left:right]) + 1 > ans:
                        ans = len(A[left:right]) + 1
                continue
            else:
                right += 1
        return ans