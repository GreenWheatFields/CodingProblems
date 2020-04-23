package com.company;

public class ShortestWord{
    public static void main(String[] args) {
findShort("the quick brown fox jumped over the lazy dog");
    }
    public static int findShort(String s) {
    String[] a = s.split(" ");
    int x = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++){
          if (a[i].length() <= x){
              x = a[i].length();
          }


        }
        System.out.println(x);
    return x;
    }
}
/* prompt
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */