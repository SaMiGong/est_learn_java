package Java0612;

public class Person {

  String name;
  int age;
  static final String GENDER = "남";
  static final int JAVALV = 2;
  static final int HEIGHT = 180;
  static final String WANT = "쉬고싶다.";

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old");
  }
}
