public class Positive{
  public static int sum(int[] arr){
    int sum2 = 0;
    int answer;
    for(int i = 0; i <= arr.length - 1; i++){
      if(arr[i] > 0){
      sum2 += arr[i];
      }    
     }
    answer = sum2;

    return answer;
  }
}
/*
You get an array of numbers, return the sum of all of the positives ones.
*/