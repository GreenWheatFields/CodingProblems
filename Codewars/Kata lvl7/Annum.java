public class Accumul {
/*
Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/   

   public static void main(String[] args) {
        System.out.println("test");
        System.out.println(accum("abcdefghijklmnopqrstvqxyz"));
    }
    public static String accum(String s) {
        String[] a = s.split("");
        for (int i = 0; i < a.length; i++){
            a[i] = a[i].substring(0,1).toUpperCase();
            if (i > 0) {
                  while (a[i].length() <= i)
                      a[i] += a[i].substring(0,1).toLowerCase();
              }
            a[i] += "-";
        }
        String str = String.join("", a);
        return str.substring(0,str.length() -1);
    }
}
