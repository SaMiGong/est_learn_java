package Java0614.Java0614_5;

import java.util.Scanner;

public class Quiz1 {
  public static void main(String[] args) {
    /*
    사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
    이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여
    적절한 메시지를 출력하세요.
     */
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("첫번째 숫자를 입력하세요: ");
      int a = scanner.nextInt();

      System.out.print("두번째 숫자를 입력하세요: ");
      int b = scanner.nextInt();

      System.out.println(a + " / " + b + " = " + a / b);
    } catch (ArithmeticException e) {
      System.out.println("고장고장 0으로 나눌 순 없습니다!");
    }
     finally {
       scanner.close();
    }
    System.out.println("프로그램 종료");
  }
}
