'''
Given an integer n, return any array containing n unique integers such that they add up to 0.
'''

class Solution:
    def sumZero(self, n: int) -> List[int]:
        result = []
        i = 1
        while len(result) < n - 1:
            result.append(i)
            result.append(i * -1)
            i += 1
        if n % 2 == 0:
            return result
        else:
            result.append(0)
            return result