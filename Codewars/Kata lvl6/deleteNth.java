import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.*;

/*
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. 
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], 
drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
Example
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
*/
class Solution {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> occurences = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < elements.length; i++) {
			// count occcurence of each #
            if (occurences.containsKey(elements[i])){
                occurences.put(elements[i], occurences.get(elements[i]) + 1);
            }else{
                occurences.put(elements[i], 1);
            }
			// copy og array while skipping numbers occuring more than n times
           if(occurences.get(elements[i]) <= maxOccurrences){
               temp.add(elements[i]);
           }
        }
		//arrayList to int array
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
public class ExampleTests {
    @Test
	public void deleteNth() throws Exception {
		assertArrayEquals(
				new int[] { 20, 37, 21 },
				Solution.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				Solution.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
				
		);
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				Solution.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 1, 1, 1 },
				Solution.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
		);
		assertArrayEquals(
				new int[] { },
				Solution.deleteNth( new int[] { }, 5 )
		);

	}
}