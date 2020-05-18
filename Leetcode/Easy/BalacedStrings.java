import org.junit.Test;

import static org.junit.Assert.assertEquals;
//1221. Split a String in Balanced Strings
// Return max num of balanced Strings ex
// EX: RLRLLLLLLLRL returns 3
class Solution {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int lCount = 0;
        int rCount = 0;
        String[] parse = s.split("");
        for (int i = 0; i < parse.length; i++){
            if (parse[i].equals("L")){
                lCount++;
            }else if (parse[i].equals("R")){
                rCount++;
            }
            if (lCount == rCount){
                lCount = rCount = 0;
                count++;
            }
        }
        return count;
    }
}

public class ExampleTests {
    @Test
    public void test_1() {
        assertEquals(4, Solution.balancedStringSplit("RLRRLLRLRL"));
    }
    @Test
    public void test_2(){
        assertEquals(3, Solution.balancedStringSplit("RLLLLRRRLR"));
    }
    @Test
    public void test_3(){
        assertEquals(1, Solution.balancedStringSplit("LLLLRRRR"));
    }
    @Test
    public void test_4(){
        assertEquals(2, Solution.balancedStringSplit("RLRRRLLRLL"));
    }
    @Test
    public void  test_5(){
        assertEquals(4,Solution.balancedStringSplit("LRLRRRLLLRL"));
    }

}
