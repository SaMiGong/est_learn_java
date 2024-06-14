package Java0614.Java0614_3;

public class Test {
  public static void main(String[] args) {
    try {
      divide(10, 0);
//    } catch (ArithmeticException | NullPointerException e) { 이런방법도있다
    } catch (ArithmeticException e) { // catch 두개 쓰는 방법
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (NullPointerException ex) { // 이런 방법도 있다.
      System.out.println("null입니다.");
    }
  }

  private static int divide(int a, int b) {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
