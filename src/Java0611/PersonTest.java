package Java0611;

public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person("가렌",1012345678, 30000, 40);
        person1.sayHello();
        Person person2 = new Person("럭스",1012345678, 30000, 40);
        person2.sayHello();
        Person person3 = new Person("카타리나",1012345678, 30000, 40);
        person3.sayHello();
        Person person4 = new Person("다리우스",1012345678, 30000, 40);
        person4.sayHello();

        Student student = new Student();
        person1.teaching(student);
        person1.cheating(student);

    }
}
