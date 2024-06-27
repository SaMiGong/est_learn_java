package BasicJavaProject.WeekQuiz3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String 타입의 BookShelf
    BookShelf<String> bookShelf = new BookShelf<>();
    // Integer 타입의 BookShelf
    BookStack<Integer> bookStack = new BookStack<>();

    // 도서 정보 입력
    System.out.println("도서 정보 입력");
    System.out.print("도서 제목: ");
    String title = sc.nextLine();
    System.out.print("도서 저자: ");
    String author = sc.nextLine();
    System.out.print("도서 식별자(문자): ");
    String identierString = sc.nextLine();
    System.out.print("도서 식별자(숫자): ");
    int identierInteger = sc.nextInt();
    sc.nextLine();

    // Book 객체 생성, 추가
    Book<String> bookForShelf = new Book<>(title, author, identierString);
    bookShelf.addBook(bookForShelf);

    Book<Integer> bookForStack = new Book<>(title, author, identierInteger);
    bookStack.pushBook(bookForStack);

    //    Book<Integer> book1 = new Book<>("위클리", "김승주", 99);
    //    Book<Integer> book2 = new Book<>("데일리", "아무개", 88);
    //    bookStack.pushBook(book1);
    //    bookStack.pushBook(book2);

    // 임의로 값 추가
    Book<String> bookForShelf2 = new Book<>("로또번호 맞추기", "특이한 놈", "A33");
    bookShelf.addBook(bookForShelf2);
    Book<Integer> bookForSteak2 = new Book<>("로또번호 맞추기", "특이한 놈", 33);
    bookStack.pushBook(bookForSteak2);

    Book<String> bookForShelf1 = new Book<>("깔깔 유머집", "이상한 놈", "A22");
    bookShelf.addBook(bookForShelf1);
    Book<Integer> bookForStack1 = new Book<>("깔깔 유머집", "이상한 놈", 22);
    bookStack.pushBook(bookForStack1);

    // BookShelf에서 도서 제목으로 검색
    System.out.print("검색할 책의 제목: ");
    String searchTitle = sc.nextLine();
    System.out.println("검색결과");
    for (Book<String> book : bookShelf.searchByTitle(searchTitle)) {
      System.out.println(
          "제목: "
              + book.getTitle()
              + ", 저자: "
              + book.getAuthor()
              + ", 식별자: "
              + book.getIdentifier());
    }

    // BookShelf에서 도서 저자로 검색
    System.out.print("검색할 저자 입력: ");
    String searchAuthor = sc.nextLine();
    System.out.println("검색 결과");
    for (Book<String> book : bookShelf.searchByAuthor(searchAuthor)) {
      System.out.println(
          "제목: "
              + book.getTitle()
              + ", 저자: "
              + book.getAuthor()
              + ", 식별자: "
              + book.getIdentifier());
    }

    // BookStack에서 도서 꺼내기, 비어있는지 확인
    while (true) {
      System.out.println("도서를 꺼내겠습니까? 1번 수락, 2번 거절");
      if (sc.nextInt() == 1) {
        try {
          Book<Integer> popForBook = bookStack.popBook();
          System.out.print(
              "꺼낸 도서 제목: "
                  + popForBook.getTitle()
                  + ", 저자: "
                  + popForBook.getAuthor()
                  + ", 식별자: "
                  + popForBook.getIdentifier());
          System.out.println();
        } catch (EmptyStackException e) {
          System.out.println("아무것도 없음");
        }
      } else {
        break;
      }
    }
    // BookStack에서 맨 위 도서 확인 (peekBook)
    while (true) {
      System.out.println("맨 위의 도서를 확인 하시겠습니까? 1번 확인, 2번 끝내기");
      if (sc.nextInt() == 1) {
        try {
          Book<Integer> peekForBook = bookStack.peekBook();
          System.out.print(
              "맨 위의 도서 제목: "
                  + peekForBook.getTitle()
                  + ", 저자: "
                  + peekForBook.getAuthor()
                  + ", 식별자: "
                  + peekForBook.getIdentifier());
          System.out.println();
        } catch (EmptyStackException e) {
          System.out.println("아무것도 없음");
          continue;
        }
      } else {
        System.out.println("스택 안에 아무것도 없나요? " + bookStack.isEmpty());
        sc.close();
        break;
      }
    }
  }
}
