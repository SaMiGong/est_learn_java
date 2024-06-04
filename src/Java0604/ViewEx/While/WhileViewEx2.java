package Java0604.ViewEx.While;

public class WhileViewEx2 {
  public static void main(String[] args) {
    /*
    1부터 주어진 양의 정수 n까지의 합을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
    주어진 값: n = 100
     */

    int i = 0;
    int sum = 0;
    while (100 >= i) {
      sum += i;
      i++;
    }
    System.out.println(sum);
  }
}
