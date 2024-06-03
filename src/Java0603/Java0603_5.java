package Java0603;

public class Java0603_5 {
  public static void main(String[] args) {

    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10); // true
    boolean result2 = (a > 5) || (b > 10); // true
    boolean result3 = !(a > 5); // false

    boolean x = true;
    boolean y = false;
    boolean z = true;
    if (x && !y){
      System.out.println("조건 1 충족");
    }
    if ((y && z) || (!x && !z)){
      System.out.println("조건 2 충족");
    }
    if (x || y || z){
      System.out.println("적어도 하나는 참");
    }
    if (!z && !y && !z){
      System.out.println("모두 거짓");
    }
  }
}
