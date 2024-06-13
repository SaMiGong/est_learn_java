package Java0613;

public class Parent {
  public static void main(String[] args) {}

  int money;

  public void saveMoney() {
    money += 1000;
    System.out.println("천원추가! ");
    System.out.println("가진 돈: " + money);
  }
}
