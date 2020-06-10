import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import org.java.utils.*;

/*
Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci].
For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
Return the number of cells with odd values in the matrix after applying the increment to all indices.
-
Runtime: 1 ms, faster than 87.58% of Java online submissions for Cells with Odd Values in a Matrix.
Memory Usage: 37.8 MB, less than 35.00% of Java online submissions for Cells with Odd Values in a Matrix.
*/
class Solution {
	public int oddCells(int n, int m, int[][] indices){
		int[][] matrix = new int[m][n];
		int result = 0;
		for (int i = 0; i < indices.length; i++) {
			matrix = fill(indices[i][0], -1, matrix);
			matrix = fill(-1, indices[i][1], matrix);
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] % 2 != 0) result++;
			}
		}
		return result;
	}
	private int[][] fill(int row, int column, int[][] matrix){
		if (column >= 0){
			for (int i = 0, j = column; i < matrix[0].length; i++) {
				matrix[column][i]++;
			}
			return matrix;
		}else if (row >= 0){
			for (int i = 0, j = row; i < matrix.length; i++) {
				matrix[i][row]++;
			}
			return matrix;
		}
		return null;
	}
}

public class ExampleTests {
	Solution s;
	int[][] test1Indeces;
	@Before
	public void setUp(){
		s = new Solution();
		test1Indeces = new int[][]{
				{6,17},{5,15},{8,18},{0,7},{14,22},{15,6},{10,0},{6,6},{10,25},{17,2},{17,23},{17,16},{17,25},{14,0},{10,0},{19,12},{8,24},{5,23},{15,18}
		};
	}
	@Test
	public void test(){
		assertEquals(207, s.oddCells(20,27,test1Indeces));
	}
}