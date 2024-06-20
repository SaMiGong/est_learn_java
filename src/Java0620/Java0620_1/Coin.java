package Java0620.Java0620_1;

public class Coin {
  private int value;

  public Coin(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public static void call() {
    System.out.println("okay");
  }

  private void call1() {
    while (true) {
      call1();
    }
  }

  private void call2() {
    System.out.println("call2");
  }
}
