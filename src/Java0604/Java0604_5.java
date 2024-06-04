package Java0604;

public class Java0604_5 {
  public static void main(String[] args) {

    for (int i = 1; i < 100; i++) {
      System.out.println("i = " + i);
      if (i == 50) break;
      for (int j = 2; j < 100; j++) {
        System.out.println("J = " + j);
        if (j == 80) break;
      }
    }
  }
}
