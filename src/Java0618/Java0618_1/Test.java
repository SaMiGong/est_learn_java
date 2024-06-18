package Java0618.Java0618_1;

public class Test {
  //  public static void main(String[] args) {
  //    System.out.println(compare(1, 2));
  //  }
  //
  //  public static <T extends Number> int compare(T t1, T t2) {
  //    double v1 = t1.doubleValue();
  //    double v2 = t2.doubleValue();
  //    return Double.compare(v1, v2);
  //  }

  public static void main(String[] args) {
    System.out.println(compareString("qwer", "qwer"));
  }

  public static <T extends String> String compareString(T t1, T t2) {
    String v1 = t1.toString();
    String v2 = t2.toString();
    return v1.equals(v2) ? "okay" : "no";
  }
}
