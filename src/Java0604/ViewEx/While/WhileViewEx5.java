package Java0604.ViewEx.While;

public class WhileViewEx5 {
  public static void main(String[] args) {
    /*
    주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요.
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
     */

    int positive = 0;
    int negative = 0;
    int i = 0;
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    while (i < numbers.length) {
      if (numbers[i] > 0) {
        positive += numbers[i];
        i++;
      } else {
        negative += numbers[i];
        i++;
      }
    }
    System.out.println("양수의 합: " + positive);
    System.out.println("음수의 합: " + negative);
  }
}
