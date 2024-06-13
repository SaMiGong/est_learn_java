package Java0613;

import org.w3c.dom.ls.LSOutput;

public class Child extends Parent {

  public void getMoney() {
  money -= 1000;
  System.out.println("천원 뺏김..");
  System.out.println("가진 돈: " + money);

  }

}
