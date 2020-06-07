import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 10^5.
All elements in the matrix are distinct.
*/
class Solution {
	/*
	Runtime: 1 ms, faster than 97.08% of Java online submissions for Lucky Numbers in a Matrix.
	Memory Usage: 39.9 MB, less than 62.21% of Java online submissions for Lucky Numbers in a Matrix.
	*/
	//another way could be extracting each column and row , then sorting it and comparing the first and last indices
	public List<Integer> luckyNumbers (int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < matrix[0].length; i++) {
			int biggestInColomn = 0;
			boolean smallest = true;
			int row = 0;
			// find the biggest in the column
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] > biggestInColomn){
					biggestInColomn = matrix[j][i];
					row = j;
				}
			}
			//see if it's the smallest in row
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[row][j] < biggestInColomn ){
					smallest = false; break;
				}
			}
			if (smallest) result.add(biggestInColomn);
		}
		return result;
	}
	}


public class ExampleTests {
	@Test
	public void simpleTest(){
		int[][] test = new int[][]{
				{3,2,1,5},
				{5,6,10,6},
				{9,12,15,11}
		};
		int[][] test2 = new int[][]{
				{7,8},
				{1,2}
		};
		int[][] test3 = new int[][]{
				{1,10,4,2},
				{9,3,8,7},
				{15,16,17,12}
		};
		List<Integer> toCompare = new ArrayList<>();
		toCompare.add(9);
		Solution s = new Solution();
		//assertEquals(toCompare, s.luckyNumbers(test));
		List<Integer> toCompare2 = new ArrayList<>();
		toCompare2.add(7);
		//assertEquals(toCompare2, s.luckyNumbers(test2));

		List<Integer> toCompare3 = new ArrayList<>();
		toCompare3.add(12);
		assertEquals(toCompare3, s.luckyNumbers(test3));


	}
}



