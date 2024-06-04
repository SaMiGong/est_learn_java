package Java0604;

public class Java0604_3 {
  public static void main(String[] args) {

    //    for (int i = 1; i <= 5; i++) {
    //      System.out.println("현재 i의 값은=" + i);
    //    }

    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println("총합: " + sum);

    //    int n = 20;
    //    int sum = 0;
    //    for (int i = 0; i <= n; i++) {
    //      if (i % 3 == 0 && i % 5 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum);

    int a = 1;
    int b = 1;
    int c = 1;
    for (int i = 0; i <= 10; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.println(c);
    }
  }
}
