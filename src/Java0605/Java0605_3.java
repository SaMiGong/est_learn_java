package Java0605;

import java.util.Scanner;

public class Java0605_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("계절을 맞춰보세요! 1번: 봄, 2번: 여름, 3번: 가을, 4번: 겨울");
    int a = sc.nextInt();
    String[] arr = {"봄","여름","가을","겨울"};
    if (a > 4 || a <= 0) {
      System.out.println("잘못된 입력입니다!");
    } else {
      System.out.println("당신이 선택한 계절은 " + arr[a-1] + "입니다!");
    }
  }
}
