package Java0613.Java0613_1;

public class Test {
  public static void main(String[] args) {
    //    InheritB inheritB = new InheritB();
    //
    //    inheritB.field2 = "필드2";
    //    inheritB.method2();
    //
    //    inheritB.field1 = 100;
    //    inheritB.method1();

    // inheritB. 해도 inheritA에 만든게 프라이빗이라 안나옴

    Child child = new Child();

    child.saveMoney();
    child.getMoney();
  }
}
