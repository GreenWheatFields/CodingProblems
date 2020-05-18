/*
Given an integer array sorted in non-decreasing order, 
there is exactly one integer in the array that occurs more than 25% of the time.
Return that integer.
*/
class Solution {
    public int findSpecialInteger(int[] arr) {
        float result = 0;
        int answer = 0;
        if(arr.length == 1){return arr[0];}
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    result++;
                }
            }
            if(result / arr.length > .25){
                return arr[i];
            }
            result = 0;
        }
            return 0;
    }
}