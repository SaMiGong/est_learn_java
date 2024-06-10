package BasicJavaProject;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
      int i = scanner.nextInt();
      if (i == 0) {
        System.out.println("종료합니다.");
        break;
      }
      if (i < 1 || i > 4) {
        System.out.println("올바른 입력이 아닙니다.");
        continue;
      }
      System.out.print("첫번째 값을 입력하세요: ");
      int a = scanner.nextInt();
      System.out.print("두번째 값을 입력하세요: ");
      int b = scanner.nextInt();
      switch (i) {
        case 1:
          System.out.println(a + " + " + b + " = " + (a + b));
          break;
        case 2:
          System.out.println(a + " - " + b + " = " + (a - b));
          break;
        case 3:
          System.out.println(a + " * " + b + " = " + (a * b));
          break;
        case 4:
          System.out.println(a + " / " + b + " = " + (a / b));
          System.out.println("나머지 = " + (a % b));
          break;
      }
    }
    scanner.close();
  }
}
