package Java0614.Java0614_5;

import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {
    /*
    사용자로부터 정수 배열의 크기와 배열 요소를 입력받아
    배열을 생성하는 프로그램을 작성하세요.
    이때, 입력된 인덱스가 배열의 크기를 벗어나면
    ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력하세요.
     */
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("배열 크기를 정해주세요: ");
      int size = scanner.nextInt();

      int[] arr = new int[size];
      for (int j = 0; j < size; j++) {
        System.out.print("배열 안에 들어갈 정수를 입력해주세요: ");
        int i = scanner.nextInt();
        arr[j] = i;
      }

      for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열크기를 벗어났습니다.");
    } finally {
      scanner.close();
    }
  }
}
