/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
    Runtime: 3 ms
	Memory Usage: 52.6 MB
*/

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int oneCount = 0, currentOneCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1){
				currentOneCount++;
			}else {
				oneCount = Math.max(currentOneCount, oneCount);
				currentOneCount = 0;
				if (oneCount > nums.length - i) return oneCount;
			}
		}
		return Math.max(oneCount, currentOneCount);
	}
}
public class ExampleTests {
	Solution s;
	@Before
	public void setUp(){
		s = new Solution();
	}
	@Test
	public void test1(){
		int[] test1 = {1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,1,0};
		int[] test2 = {1,1,1,1};
		int[] test3 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1};
		assertEquals(12, s.findMaxConsecutiveOnes(test1));
		assertEquals(18, s.findMaxConsecutiveOnes(test3));
	}
}