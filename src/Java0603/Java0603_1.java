package Java0603;

public class Java0603_1 {
  public static void main(String[] args) {

    //    int number1 = 10;
    //    int number2 = 3;
    //
    //    int sum = number1 + number2;
    //    int diff1 = number2 - number1;
    //    int diff2 = number1 - number2;
    //
    //    int product = number1 * number2;
    //    int quot = number1 / number2;
    //    int remainder = number1 % number2;
    //
    //    System.out.println("덧셈: " + sum);
    //    System.out.println("뺄셈: " + diff1);
    //    System.out.println("뺄셈2: " + diff2);
    //    System.out.println("곱셈: " + product);
    //    System.out.println("나눗셈: " + quot);
    //    System.out.println("나머지: " + remainder);

    //    byte a = 1;
    //    byte b = 2;
    //    byte c = a + b;
    //    int d =(int) a + b; // 에러. byte는 int로 변환 후 연산되기 때문

    //    int a = 10;
    //    int b = 4;
    //    int c = a/b; // 2.5가 아닌 2가 나온다.
    //    double d = a/b; // 2.0이 출력된다
    //    double e =(double) a/b; // 2.5가 출력된다.

    //    char c1 = 'a' + 1; // A는 유니코드 65, B는 66이므로 B가 출력
    //    char c2 = 'b';
    //    char c3 = c2 + 1; // 에러

    //    String str1 = "안녕하세요";
    //    String str2 = "만나서 반갑습니다.";
    //    String str3 = str1 + str2;
    //    System.out.println(str3);

    //    // 문자열 "Hello"와 123이 먼저 연산되어 "Hello123"이 되고,
    //    // 이것을 다시 456과 연산하여 "Hello123456"이 됩니다.
    //    System.out.println("Hello" + 123 + 456); // Hello123456
    //
    //    // 숫자 123과 456이 먼저 연산되어 579가 되고,
    //    // 이것을 문자열 "Hello"와 연산하여 "579Hello"가 됩니다.
    //    System.out.println(123 + 456 + "Hello"); // 579Hello
    //    StringBuilder sb = new StringBuilder();
    //    sb.append(123);
    //    sb.append(456);
    //    sb.append("Hello");
    //    System.out.println(sb);

    //    int number1 = 10;
    //    int number2 = 30;
    //
    //    System.out.println(number1 > number2);
    //    System.out.println(number1 < number2);
    //    System.out.println(number1 <= number2);
    //    System.out.println(number1 >= number2);
    //    System.out.println(number1 == number2);
    //    System.out.println(number1 != number2);

    //    String a = new String();
    //    String b = new String();
    //    System.out.println(a == b); // false
    //    System.out.println(a.equals(b)); // true 참조타입은 equals로 해야함

//    System.out.println('A' < 'B'); // 유니코드도 비교를 함 A = 65, B = 66

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
// 객체가 두개가 생김 객체1 = str1,str2, 객체2 = str3
    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    System.out.println(str1.equals(str3)); // true, equals는 값비교
  }
}
