package Java0605.ViewEx;

import java.util.Scanner;

public class ScannerViewEx2 {
  public static void main(String[] args) {
    /*
        문제: "영화 티켓 예매 시스템

    영화관에서 사용할 수 있는 간단한 티켓 예매 시스템을 만들어보세요.
    이 시스템은 사용자로부터 다음과 같은 정보를 입력받아야 합니다:

    1. 영화 제목 (문자열)
    2. 관람 인원 수 (정수)
    3. 예매자의 이름 (문자열)
    4. 예매자의 전화번호 (문자열)

    입력받은 정보를 바탕으로 다음과 같은 형식으로 예매 정보를 출력해야 합니다:
    추가로, 티켓 가격은 1인당 10,000원으로 가정하고,
    총 결제 금액을 계산하여 예매 정보 출력 후에 다음과 같이 출력해야 합니다:
         */

    // 첫번째 답
    //    Scanner scanner = new Scanner(System.in);
    //
    //    System.out.print("영화 제목: ");
    //    String movie = scanner.nextLine();
    //    System.out.print("관람 인원: ");
    //    int party = scanner.nextInt();
    //    scanner.nextLine();
    //    System.out.print("예매자 이름: ");
    //    String name = scanner.nextLine();
    //    System.out.print("예매자 전화번호: ");
    //    int phone = scanner.nextInt();
    //    party = party * 10000;
    //    System.out.println("총 결제 금액: " + party + "원");
    //
    //    scanner.close();

    // 두번째 답
    Scanner scanner = new Scanner(System.in);

    System.out.print("영화 제목을 입력하세요: ");
    String movieTitle = scanner.nextLine();

    System.out.print("관람 인원 수를 입력하세요: ");
    int numOfPeople = scanner.nextInt();
    scanner.nextLine(); // 개행 문자 제거

    System.out.print("예매자의 이름을 입력하세요: ");
    String bookingName = scanner.nextLine();

    System.out.print("예매자의 전화번호를 입력하세요: ");
    String bookingPhone = scanner.nextLine();

    int ticketPrice = 10000; // 1인당 티켓 가격
    int totalPrice = ticketPrice * numOfPeople; // 총 결제 금액 계산

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목: " + movieTitle);
    System.out.println("관람 인원: " + numOfPeople + "명");
    System.out.println("예매자 이름: " + bookingName);
    System.out.println("예매자 전화번호: " + bookingPhone);
    System.out.println("총 결제 금액: " + totalPrice + "원");

    scanner.close();
  }
}
