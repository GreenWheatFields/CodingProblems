import unittest
'''
Complete the solution so that the function will break up camel casing, using a space between words.
Example
solution("camelCasing")  ==  "camel Casing"
'''

def solution(s: str):
    to_parse = list(s)
    for i in range(len(to_parse)):
        if to_parse[i] == to_parse[i].upper():
            to_parse[i] = "@{}".format(to_parse[i])

    return "".join(to_parse).replace("@", " ")


class MyTestCase(unittest.TestCase):
    def test_problem(self):
        self.assertEqual(solution("helloWorld"), "hello World")
        self.assertEqual(solution("camelCase"), "camel Case")
        self.assertEqual(solution("breakCamelCase"), "break Camel Case")


if __name__ == '__main__':
    MyTestCase().test_problem()