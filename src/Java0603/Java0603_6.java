package Java0603;

public class Java0603_6 {
  public static void main(String[] args) {

    String day = "mon";
    switch (day) {
      case "mon":
        System.out.println("월요일");
        break;
      case "tue":
        System.out.println("화요일");
        break;
      case "wed":
        System.out.println("수요일");
        break;
      case "thu":
        System.out.println("목요일");
        break;
      case "fri":
        System.out.println("금요일");
        break;
      case "sat":
        System.out.println("토요일");
        break;
      case "sun":
        System.out.println("일요일");
        break;
    }

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Execllent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    int num1 = 0;
    int num2 = 0;
    char operator = '+';
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    int score = 66;
    switch (score / 10) {
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("자바입니다.");
        break;
      case "Python":
        System.out.println("파이썬입니다.");
        break;
      case "C++":
        System.out.println("C++입니다.");
        break;
      case "JavaScript":
        System.out.println("자바스크립트입니다.");
        break;
    }
  }
}
