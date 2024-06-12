package Java0612;

public class PersonTest {
  public static void main(String[] args) {

    Person person1 = new Person("승조", 25, "male");
    Person person2 = new Person("max", 21, "male");

    System.out.println(Person.GENDER);
    System.out.println(Person.HEIGHT);
    System.out.println(Person.JAVALV);
    System.out.println(Person.WANT);

    //        person1.sayHello();
    //        person1.introduce();
    //
    //        person2.sayHello();
    //        person2.introduce();
  }
}
