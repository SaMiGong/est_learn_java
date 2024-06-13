package Java0613.Java1613_5;

public class Cat extends Animal {
  public Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
