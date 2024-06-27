package BasicJavaProject.WeekQuiz3;

public class Book<T> {
  private String title; // 책의 제목
  private String author; // 책의 저자
  private T identifier; // 책의 고유 식별자

  public Book(String title, String author, T identifier) {
    this.title = title;
    this.author = author;
    this.identifier = identifier;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public T getIdentifier() {
    return identifier;
  }
}
