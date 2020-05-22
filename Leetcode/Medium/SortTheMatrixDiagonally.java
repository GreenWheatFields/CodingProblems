import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

class Solution {
    public static int[][] diagonalSort(int[][] mat) {

        ArrayList<Integer> sorted = new ArrayList<>();

        int row,col;
        // iterate diagonally from 0,0 to (mat.length,0) (half of the matric )and extract to arraylist
        for (int i = 0; i < mat.length + 1; i++ ){
            for (row = i, col = 0; row < mat.length && col < mat[0].length; row++, col++) {
                sorted.add(mat[row][col]);
            }
        //sort the extracted data
            Collections.sort(sorted);
        //reiterate and add new sorted data    
            for (row = i, col = 0; row < mat.length && col < mat[0].length; row++, col++) {
                mat[row][col] = sorted.get(0);
                sorted.remove(0);
            }
        }
        // iterate through the second half 
        for (int i = 1; i < mat[0].length ; i++){
            for (col = i, row = 0; col < mat[0].length && row < mat.length; col++, row++) {
                sorted.add(mat[row][col]);

            }            
            Collections.sort(sorted);
            
            for (col = i, row = 0; col < mat[0].length && row < mat.length; col++, row++) {
                mat[row][col] = sorted.get(0);
                sorted.remove(0);
            }
        }
            return mat;
    }

}
public class ExampleTests {
    @Test
    public void test_1() {//
        int[][] test = {{3,3,1,1},      //1 1 3 3  //1 1 1 2 //1 1 1 1 // 1 1 1 1 1 1 2 2 2 2 3 3
                        {2,2,1,2},      //1 2 2 2  //1 1 2 2 //1 2 2 2
                        {1,1,1,2}};     //1 1 1 2  //1 2 3 3 //1 2 3 3
        int[][] result = {{1,1,1,1}, {1,2,2,2}, {1,2,3,3}};
        assertEquals(result, Solution.diagonalSort(test));
    }
}