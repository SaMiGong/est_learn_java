package BasicJavaProject.WeekQuiz3;

import java.util.ArrayList;
import java.util.List;


public class BookShelf<T> implements BookManager {
  private ArrayList<Book<T>> books; // Book 객체 저장하는 리스트

  public BookShelf() {
    books = new ArrayList<>();
  }

  @Override
  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book book) {
    books.remove(book);
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    List<Book<T>> result = new ArrayList<>();
    for (Book<T> book : books) {
      if (book.getTitle().equalsIgnoreCase(title) && book.getTitle().contains(title)) {
//        return books;
        result.add(book);
      }
    }
    return result;
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    List<Book<T>> result = new ArrayList<>();
    for (Book<T> book : books) {
      if (book.getAuthor().equalsIgnoreCase(author) && book.getAuthor().contains(author)) {
//        return books;
        result.add(book);
      }
    }
    return result;
  }
}
