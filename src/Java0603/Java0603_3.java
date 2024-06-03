package Java0603;

public class Java0603_3 {
  public static void main(String[] args) {

    int score = 95;
    char grade1 = (score > 90) ? 'A' : 'B';
    String grade2 = (score == 95 && score % 5 == 0) ? "good" : "bad";

    if (score == 95 && score % 5 == 0) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
  }
}
