package Java0613.Java0613_3;

public class Student extends Person {
  int studentNo;

  public Student(String name, String ssn, int studentNO) {
    super(name, ssn); // 부모의 생성자 호출
    this.studentNo = studentNO;
  }
}
