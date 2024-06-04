package Java0604.ViewEx.While;

public class WhileViewEx4 {
  public static void main(String[] args) {
    /*
    주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램을 작성하세요.
    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
     */
    int i = 0;
    int max = 0;
    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    while (i < numbers.length) {
      if (max < numbers[i]) { // numbers 배열안의 값이 max에 있는 숫자보다 작다면
        max = numbers[i]; // max에 지금 가르키고 있는 numbers 배열안의 값을 넣는다
        i++; // 다음 index
      }
      i++; // 다음 index
    }
    System.out.println(max);
  }
}
