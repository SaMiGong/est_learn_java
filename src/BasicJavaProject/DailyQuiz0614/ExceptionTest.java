package BasicJavaProject.DailyQuiz0614;

public class ExceptionTest {
  public static void main(String[] args) {
    try {
      throw new CustomException("내가 만든 익셉션~"); // 던지기
    } catch (CustomException e) { // 잡기
      System.out.println("받았다! 예외 메세지는? " + e.getMessage());
    }
  }
}
