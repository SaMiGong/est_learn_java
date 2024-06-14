package Java0614;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    try {
      int result = 10 / 2;
      System.out.println(result);
    } catch (ArithmeticException e) { // 예외가 터지지 않아서 실행안됨
        // 언체크드 예외
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
  }
}
