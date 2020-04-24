public class Maskify {
    public static String maskify(String str) {
        char[] a = str.toCharArray();

            if (a.length > 4) {
            for (int i = 0; i <= a.length - 5; i++){
                a[i] = '#';
                }
            }
                    return String.valueOf(a);
    }
}

/*
Your task is to write a function maskify, which changes all but the last four characters into '#'.
*/