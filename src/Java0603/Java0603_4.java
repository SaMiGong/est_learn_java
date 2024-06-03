package Java0603;

import org.w3c.dom.ls.LSOutput;

public class Java0603_4 {
  public static void main(String[] args) {

    //        int score = 90;
    //        if(score==90){
    //            // true 일 때
    //        } else{
    //            // false 일 때
    //        }

    //    int number = 10;
    //    if (number > 10) {
    //      System.out.println("number는 10보다 큽니다.");
    //    } else if (number < 10) {
    //      System.out.println("number는 10보다 작습니다.");
    //      if(number>5){
    //        System.out.println("number는 5보다 큽니다.");
    //      }
    //    } else {
    //      System.out.println("number는 10입니다.");
    //    }

    ////    당신은 두 개의 정수 변수 **`a`**와 **`b`**를 가지고 있습니다. 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요:
    ////
    ////    1. **`a`**가 **`b`**보다 크면 "a is greater than b"를 출력합니다.
    ////    2. **`a`**와 **`b`**가 같으면 "a and b are equal"을 출력합니다.
    ////    3. **`a`**가 **`b`**보다 작으면 "a is less than b"를 출력합니다.
    //    int a = 0;
    //    int b = 0;
    //    //    if (a > b) {
    //    //      System.out.println("a is greater than b");
    //    //    } else if (a == b) {
    //    //      System.out.println("a and b are equal");
    //    //    } else {
    //    //      System.out.println("a is less than b");
    //    //    }
    //
    //    String number =
    //        (a > b) ? "a is greater than b" : (a < b) ? "a is less than b" : "a and b are equal";
    //    System.out.println(number);

    //    // 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자)
    //    int x = 10;
    //    if (x >= 1){
    //      System.out.println("양수");
    //    } else if (x == 0){
    //      System.out.println("0");
    //    } else System.out.println("음수");
    //  String y = (x >= 1) ? "양수" : (x == 0) ? "0" : "음수";
    //    System.out.println(y);

    //    // 변수 score에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
    //    int score = 75;
    //    if (score >= 90) {
    //      System.out.println("A");
    //    } else if (score >= 80) {
    //      System.out.println("B");
    //    } else if (score >= 70) {
    //      System.out.println("C");
    //    } else if (score >= 60) {
    //      System.out.println("D");
    //    } else {
    //      System.out.println("F");
    //    }

    //    int year = 2023;
    //    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    //      System.out.println("윤년입니다.");
    //    } else{
    //      System.out.println("윤년이 아닙니다.");
    //    }

    int a = 10;
    int b = 20;
    int c = 30;
    if (a > b){
      if (a > c){
        System.out.println("a가 제일 큰 수 입니다.");
      } else if (a < c){
        System.out.println("c가 제일 큰 수입니다.");
      }
    } else if (b > c) {
      System.out.println("b가 제일 큰 수입니다.");
    } else if (b < c){
      System.out.println("c가 제일 큰 수 입니다.");
    }

    int passScore = 60;
    int myScore = 75;
    if (myScore >= passScore) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }

    System.out.println((myScore >= passScore) ? "합격" : "불합격");
  }
  }
}
