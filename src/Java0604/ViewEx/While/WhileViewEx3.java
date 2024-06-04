package Java0604.ViewEx.While;

public class WhileViewEx3 {
  public static void main(String[] args) {
    /*
    - 주어진 배열 numbers에 저장된 숫자들의 평균을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
        - 주어진 배열: numbers = [5, 2, 9, 1, 7, 4, 6, 3, 8]
     */
    int i = 0;
    int sum = 0;
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    while (i < numbers.length) {
      sum += numbers[i]; // 지금 가르키고 있는 index를 sum에 합한다.
      i++;
    }
    System.out.println("numbers의 평균은 " + sum / numbers.length);
  }
}
