package Java0605;

import java.util.Scanner;

public class Java0605_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("영화 제목: ");
    String movie = scanner.nextLine();
    System.out.print("관람 인원: ");
    int party = scanner.nextInt();
    scanner.nextLine();
    System.out.print("예매자 이름: ");
    String name = scanner.nextLine();
    System.out.print("예매자 전화번호: ");
    int phone = scanner.nextInt();
    party = party * 10000;
    System.out.println("총 결제 금액: " +party + "원");

    scanner.close();
  }
}
