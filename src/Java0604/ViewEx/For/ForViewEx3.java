package Java0604.ViewEx.For;

public class ForViewEx3 {
  public static void main(String[] args) {
    /*
    **구구단 n단 출력하기**

    **목표**: 이중 반복문을 사용하여 구구단 n단을 출력하는 프로그램을 작성하세요.

    **조건**:

    1. 두 개의 반복문을 사용하여 1부터 9까지 2~n와 곱하는 작업을 반복합니다.
    2. 구구단은 한 줄에 하나씩 출력되며, 각 줄에는 "<단> × <곱할 숫자> = <결과>" 형식으로 출력합니다.
     */

    for (int i = 2; i < 10; i++) {
      System.out.println(i + "단");
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }
  }
}
