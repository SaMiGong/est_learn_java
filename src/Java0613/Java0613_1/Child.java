package Java0613.Java0613_1;

public class Child extends Parent {

  public void getMoney() {
  money -= 1000;
  System.out.println("천원 뺏김..");
  System.out.println("가진 돈: " + money);

  }

}
