class Solution {
  static int stray(int[] numbers) {
        int odd = 0;
        for (int i = 0; i < numbers.length; i++){
            int test = numbers[0];
            if (test != numbers[1] && test != numbers[2]){
                test = numbers[1];
            }
            if (numbers[i] != test){
                odd = numbers[i];
            }
        }
        return odd;
    }
}
/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.


*/