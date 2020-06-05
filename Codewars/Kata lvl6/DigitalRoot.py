import unittest
'''
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
'''

def digital_root(n):
    if len(str(n)) == 1:
        return n
    answer = 0
    for i in str(n):
        answer += int(i)
    if len(str(answer)) == 1:
        return answer
    else:
        return digital_root(answer)
    

class Tests(unittest.TestCase):

    def test_Soloution(self):
        self.assertEqual(digital_root(16), 7)
        self.assertEqual(digital_root(2),2)
        self.assertEqual(digital_root(942), 6)
        self.assertEqual(digital_root(132189), 6)
        self.assertEqual(digital_root(493193), 2)
        
    

if __name__ == '__main__':
    unittest.main()
