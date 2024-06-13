package Java0613.Java0613_4.Java_4_1;

public class Test {
  public static void main(String[] args) {
    int r = 10;

    Calculator calculator = new Calculator();
    System.out.println("원면적" + calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원면적" + computer.areaCircle(r));
  }
}
