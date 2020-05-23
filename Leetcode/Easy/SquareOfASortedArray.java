
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return  A;
    }
}
public class ExampleTests {
    @Test
    public void test_1() {
        int[] correct = {0,1,9,16,100};
        int[] toSort = {-4,-1,0,3,10};
        Assert.assertArrayEquals(correct, Solution.sortedSquares(toSort));
    }
}