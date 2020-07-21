import unittest

'''
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
pretty slow
'''


def replaceElement(arr):
    x = [max(arr[i + 1:]) for i in range(0, len(arr) - 1)]
    x.append(-1)
    return x


class Tests(unittest.TestCase):

    def test_Soloution(self):
        arr = [17, 18, 5, 4, 6, 1]
        output = [18, 6, 6, 6, 1, -1]
        self.assertEqual(output, replaceElement(arr))


if __name__ == '__main__':
    unittest.main()
