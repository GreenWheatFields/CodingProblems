import org.junit.Assert;
import org.junit.Test;

/*
Given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*/

class Solution {
    public static int maximum69Number (int num) {
        String[] toParse = Integer.toString(num).split("");
        for(int i = 0; i < toParse.length; i++){
            if (toParse[i].equals("6")){
                return Integer.parseInt(Integer.toString(num).substring(0, i)+ "9" + Integer.toString(num).substring(i + 1));
            }
        }
        return num;
    }
}
public class ExampleTests {
    @Test
    public void test_1() {
        Assert.assertEquals(9969, Solution.maximum69Number(9669));
        Assert.assertEquals(9999, Solution.maximum69Number(9999));
        Assert.assertEquals(99999, Solution.maximum69Number(99996));
        Assert.assertEquals(9669, Solution.maximum69Number(6669));

    }
}