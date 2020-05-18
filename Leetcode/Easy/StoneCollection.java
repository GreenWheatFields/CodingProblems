import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*771
You're given strings J representing the types of stones that are jewels, and S representing 
the stones you have.  Each character in S is a type of stone you have.  
You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
class Solution {
    public static int numJewelsInStones(String J, String S) {
        String[] theirs = J.split("");
        String[] ours = S.split("");
        int result = 0;
        for (int i = 0; i < theirs.length; i++){
            for (int j= 0; j < ours.length; j++){
                if (theirs[i].equals(ours[j])){
                    result++;
                }
            }
        }
        return result;
    }
}

public class ExampleTests {
    @Test
    public void test_1() {
        assertEquals(3, Solution.numJewelsInStones("aA", "aAAbbbb"));
    }
    @Test
    public void test_2(){
        assertEquals(0,Solution.numJewelsInStones("ZZ", "z"));
    }
    @Test
    public void test_3(){
        assertEquals(2,Solution.numJewelsInStones("JjKk", "JK"));
    }
}