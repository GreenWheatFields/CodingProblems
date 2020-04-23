public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] a = name.split(" ");
    String b = a[0].toString().substring(0,1).toUpperCase();
    String c = a[1].toString().substring(0,1).toUpperCase();
    name = b + "." + c;
    return name;
  }
}