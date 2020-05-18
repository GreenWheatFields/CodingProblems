// multiples of 3 print fizz, 5 buzz, 3 and 5 fizzBuzz, else print the number
class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<String>();
        for(int i = 1; i < n + 1; i++){
            String output = Integer.toString(i);
            if (i % 3 == 0 && i % 5 == 0){
                output = "FizzBuzz";
            }else if (i % 3 == 0){
                 output = "Fizz";
             }
            System.out.println(output);
             a.add(output);
        }
        return a;
    }
}