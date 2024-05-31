package Java0531;

public class Java0531_2 {
  public static void main(String[] args) {

    //    String a = "Hello World!";
    //    System.out.println(a.contains("World"));
    //    // estsoft 를 b라는 변수에 담고, soft단어가 포함되어 있는지 코드를 작성하시오
    //    String b = "ESTSOFT";
    //    System.out.println(b.contains("SOFT"));

    //    // charAt 같은 경우 많이 쓰지 않음
    //    String findChar = "What is your hobby";
    //    System.out.print(findChar.charAt(13));
    //    System.out.print(findChar.charAt(14));
    //    System.out.print(findChar.charAt(15));
    //    System.out.print(findChar.charAt(16));
    //    System.out.print(findChar.charAt(17)); // hobby

        // ~문자를 ~문자로 바꾸기
        String a = "Hello World! Hello World! Hello World!";
        System.out.println(a.replaceAll("World", "Java"));
        System.out.println(a.replace("World", "Java"));
        System.out.println(a.replaceFirst("World", "Java"));


    //    // substring
    //    String a = "WEEEE ASKE ;ND";
    //    System.out.print(a.substring(0, 3));
    //    System.out.print(a.substring(8, 10));
    //    System.out.print(a.substring(12, 14));

//    // split 물어봐야함
//    String a = "a:b:c:d";
//    String[] split = a.split(":");
//
//    // concat
//    String result = "Hello";
//    result = result + "!"; // 똑같은거
//    System.out.println(result+"!"); // 똑같은거
//    System.out.println("-================");
//    String concat = result.concat("!");
//    System.out.println(concat);
  }
}
