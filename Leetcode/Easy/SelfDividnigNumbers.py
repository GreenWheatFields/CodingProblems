'''
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
'''
class Solution(object):
    def selfDividingNumbers(self, left, right):
        flag = True
        result = []
        for number in range(left, right + 1):
            for digit in str(number):
                if digit == "0":
                    flag = False
                elif number % int(digit) != 0:
                    flag = False

            if flag: result.append(number)
            flag = True
        return result