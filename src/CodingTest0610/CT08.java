package CodingTest0610;

public class CT08 {
  public static void main(String[] args) {
    /*
    주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

    System.out.println(repeatChar("The")); // "TThhee"
    System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
    System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
    */
    System.out.println(repeatChar("Help"));
  }

  static String repeatChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char theChar = str.charAt(i);
      result += "" + theChar + theChar;
    }

    return result;
  }
}
