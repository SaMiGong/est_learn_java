package Java0604.ViewEx.For;

public class ForVIewEx4 {
  public static void main(String[] args) {

    /*
    구구단 19단을 역방향으로 출력하는 프로그램을 작성하세요.
    출력 형식은 "19 x 19 = 361"부터 "19 x 1 = 19"까지 역순으로 출력되어야 합니다.
    */
    for (int i = 20; i > 0; i--) {
      System.out.println(i + "단");
      for (int j = 20; j > 0; j--) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }
  }
}
