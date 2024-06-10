package CodingTest0610;

public class CT06 {
  public static void main(String[] args) {
    /*
            정수 n이 주어졌을 때, 숫자를 문자열 형태로 변환하고 뒤에 "!"를 붙여 반환하세요.
    예를 들어, 정수가 13인 경우 이 메서드는 "13!"을 반환해야 합니다.
    하지만, 숫자가 3으로 나누어 떨어지면 숫자 대신 "새콤!"를 반환하고,
    5로 나누어 떨어지면 "달콤!"를 반환하며, 3과 5 모두로 나누어 떨어지면
    "새콤달콤!"를 반환해야 합니다.

    secomDalcom(1)   ---> "1!"
    secomDalcom(2)   ---> "2!"
    secomDalcom(3)   ---> "새콤!"
             */
    System.out.println(secomDalcom(15));
  }

  static String secomDalcom(int n) {
    // 방법 1
    //    if (n % 3 == 0 && n % 5 == 0) {
    //      return "새콤달콤!";
    //    }
    //    if (n % 3 == 0) {
    //      return "새콤!";
    //    } else if (n % 5 == 0) {
    //      return "달콤!";
    //    } else {
    //      return n + "!";
    //    }

    // 방법 2
    boolean secom = n % 3 == 0;
    boolean dalcom = n % 5 == 0;
    if (secom && dalcom) return "새콤달콤";
    if (secom) return "새콤!";
    if (dalcom) return "달콤!";
    return n + "!";
  }
}
