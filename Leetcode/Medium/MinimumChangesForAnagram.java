/*
1347. Minimum Number of Steps to Make Two Strings Anagram
Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
Return the minimum number of steps to make t an anagram of s.
An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
*/
class Solution {
    public static int minSteps(String s, String t) {
        int[] chars = new int[26];
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                answer+= chars[i];
            }
        }
        return answer;
    }
}

public class ExampleTests {
    @Test
    public void test_1() {
        Assert.assertEquals(1, Solution.minSteps("bab", "aba"));
        Assert.assertEquals(5, Solution.minSteps("leetcode", "practice"));
        Assert.assertEquals(4,Solution.minSteps("ojkimopems", "hiomjdkfpz"));
    }
}








/*
first attempt

class Solution {
    public static int minSteps(String s, String t) {
        String[] x = s.split("");
        String[] y = t.split("");
        int answer = s.length();
        for (int i = 0; i < x.length; i++){
            for(int j = 0; j < y.length; j++){
                if (x[i].equals(y[j])){
                    answer--;
                    y[j] = "@";
                    break;
                }
            }
        }
        return answer;
    }
}
*/