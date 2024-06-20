package Java0620.Java0620_2;

public class MyThread extends Thread {
  private String name;

  public MyThread(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(this.name);
    super.run();
  }
}
