# Given a 32-bit signed integer, reverse digits of an integer. no overflow
class Solution:
    def reverse(self, x: int) -> int:
        number = str(x)
        result = ""
        for i in reversed(range(len(number))):
            result += number[i] if number[i].isdigit() else ""
        if 2147483647 < int(result) or int(result) < -2147483647:
            return 0
        elif x < 0:
            return int(result) * -1
        else:
            return int(result)