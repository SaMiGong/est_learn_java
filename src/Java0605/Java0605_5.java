package Java0605;

import java.util.Random;
import java.util.Scanner;

public class Java0605_5 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int number = random.nextInt(100) + 1;
    while (true) {
      System.out.print("숫자를 입력하세요: ");
      int i = scanner.nextInt();
      if (number > i) {
        System.out.println("숫자가 입력한 숫자보다 큽니다");
      } else if (number < i) {
        System.out.println("숫자가 입력한 숫자보다 작습니다.");
      } else {
        System.out.println("정답입니다!");
        break;
      }
    }
    scanner.close();
  }
}
