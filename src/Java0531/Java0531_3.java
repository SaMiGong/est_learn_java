package Java0531;

public class Java0531_3 {
  public static void main(String[] args) {

    // format
    String name1 = "Tim";
    int age1 = 30;
    String name2 = "Anna";
    int age2 = 45;
    String format = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String format1 = String.format("%s의 나이는 %s세 입니다", name2, age2);
    System.out.println(format);
    System.out.println(format1);
  }
}
