package Java0614;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    //    try {
    //      int result = 10 / 0;
    //      System.out.println(result);
    //    } catch (NullPointerException e) { // 예외가 터지지 않아서 실행안됨
    //      // 언체크드 예외
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    } finally {
    //      System.out.println("이건 예외여부와 상관없이 항상 실행됩니다.");
    //    }
    //    System.out.println("정상적으로 종료되었습니다.");
    //  }
    Scanner scanner = new Scanner(System.in);
    try {
      int i = scanner.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      scanner.close();
    }
  }
}
