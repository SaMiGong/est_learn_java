package Java0604.ViewEx.For;

public class FibonacciEx {
  public static void main(String[] args) {
    /*
            피보나치 수열의 첫 10개 항을 출력하는 프로그램을 작성하세요.

    설명:
    피보나치 수열은 다음과 같이 정의됩니다:

    - 첫 번째 항과 두 번째 항은 1입니다.
    - 세 번째 항부터는 이전 두 항의 합으로 정의됩니다.

    피보나치 수열의 첫 10개 항은 다음과 같습니다:
    `1, 1, 2, 3, 5, 8, 13, 21, 34, 55`

    이 문제에서는 for문을 사용하여 피보나치 수열의 첫 10개 항을 차례로 출력해야 합니다.

    힌트:

    - 첫 번째 항과 두 번째 항을 변수에 초기화합니다.
    - for문을 사용하여 10번 반복합니다.
    - 각 반복에서 이전 두 항의 합을 계산하여 다음 항을 구합니다.
    - 현재 항을 출력합니다.
             */

    int a = 1;
    int b = 1;
    int c = 1;
    for (int i = 0; i <= 10; i++) {
      c = a + b; // c에 두개 더한 값 저장
      a = b; // b값을 a로 옮김
      b = c; // b에 앞에 두개 더한값을 저장한 c를 저장
      System.out.println(c); // c는 더한 값을 가지고 a의 값을 b로 옮기고 b는 더한값c를 가짐
    }
  }
}