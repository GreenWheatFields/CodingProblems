/*
A peak element is an element that is greater than its neighbors.
Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5
Explanation: Your function can return either index number 1 where the peak element is 2,
             or index number 5 where the peak element is 6.
-
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
Memory Usage: 38.8 MB, less than 94.71% of Java online submissions for Find Peak Element.
*/
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Solution {
	public int findPeakElement(int[] nums) {
		//edge cases
		if (nums.length == 1){return 0;}
		else if (nums.length < 3 ){return (nums[0] > nums[1]) ? 0 : 1;}
		for (int left = 0, center = 1, right = 2; right < nums.length; left++, center++, right++) {
			// compare against the middle of three numbers to see if it is the biggest
			if (nums[center] > nums[left] && nums[center] > nums[right])return center;
			//edge case, if the last number is the biggest return that number
			if (right == nums.length -1) return (nums[right] > nums[center]) ? right : 0;
		}
		return 0;
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
//		int[] test1 = {1,2,3};
//		assertEquals(2, s.findPeakElement(test1));
		int[] test2 = {3,2,1};
		assertEquals(0, s.findPeakElement(test2));

	}
}