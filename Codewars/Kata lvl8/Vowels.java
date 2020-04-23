public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char[] vowel = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < vowel.length; j++) {
        if (str.charAt(i) == vowel[j]) {
          vowelsCount++;
        }
      }
    }

    return  vowelsCount;
  }

}
/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces
*/