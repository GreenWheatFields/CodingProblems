import unittest
from typing import List
'''
We are given an array A of N lowercase letter strings, all of the same length.

Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.

For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"], and the remaining columns of A are ["b","v"], ["e","y"], and ["f","z"].  (Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]]).

Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.

Return the minimum possible value of D.length.
'''


def minDeletionSize(A: List[str]) -> int:
    answer = 0
    temp = ""
    for i in range(0, len(A[0])):
        for j in range(0, len(A)):
            temp += A[j][i]
        answer += 1 if temp != "".join(sorted(temp)) else 0
        temp = ""
    return answer


class Tests(unittest.TestCase):
    def test_Solution(self):
        A = ["cba", "daf", "ghi"]
        self.assertEqual(1, minDeletionSize(A))


if __name__ == '__main__':
    unittest.main()
