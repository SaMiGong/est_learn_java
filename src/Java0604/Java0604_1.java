package Java0604;

import java.util.stream.IntStream;

public class Java0604_1 {
  public static void main(String[] args) {

    //    int i = 1;
    //    while (i <= 5) {
    //      System.out.println("현재 i의 값은 = " + i);
    //      i++;
    //    }

    //    int i = 10;
    //    while (i >= 0) {
    //      System.out.println("현재 카운트 : " + i);
    //      i--;
    //    }
    //    System.out.println("카운트 종료");S

    //    int sum = 0;
    //    int n = 0;
    //    while (n <= 100) {
    //      sum += n;
    //      n++;
    //    }
    //    System.out.println("sum = " + sum);

    //    // 같은 코드
    //    int sum = IntStream.rangeClosed(1, 100).sum();
    //    System.out.println(sum);

    int i = 0;
    int sum = 0;
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println("평균: " + sum / numbers.length);
  }
}
