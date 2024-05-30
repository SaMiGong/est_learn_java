public class java0530_4 {

  public static void main(String[] args) {
    /**
     * 변수는 숫자로 시작하면 안된다.
     * 대소문자 구별이 된다.
     * 변수를 예약어로 하면 안된다.
     * _, $ 는 허용.
     * first name 같은 변수는 firstName 으로 쓴다.
     */
//    // 정수형 자료형
//    int a = 1;
//    byte b = 2;
//    long c = 3;
//    short d = 4;
//
//    // 실수형 자료형
//    float e = 0.1f; // 뒤에 f를 꼭 붙여야함
//    double f = 0.2;
//
//    // 문자 (문자열아님)
//    char g = 'g';
//    System.out.println(g);
//
//    // boolean (true, false)
//    boolean isTrue = true;
//    boolean isFalse = false;
//
//    String str = "Hello World";

    // int의 최대값 2147483647
//    int a = 2147483648; // 초과

    // 원시타입
    int a = 1;
    int v = a;
    System.out.println(a); // 1
    System.out.println(v); // 1

    char c1 ='A';
    char c2 = 65;
    char c3 = '\u0041';

    char c4 = '가';
    char c5 = 44032;
    char c6 = '\uac00';

    int unicode = c1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(unicode);
  }
}
