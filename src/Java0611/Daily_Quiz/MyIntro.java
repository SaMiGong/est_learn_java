package Java0611.Daily_Quiz;

public class MyIntro {
  String name;
  int age;

  // 생성자
  public MyIntro(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  public void sayIntro() {
    System.out.println("안녕하세요, 저는 " + name + "입니다. 나이는 " + age + "살입니다.");
  }

  // Language 클래스를 만든 후 적을 수 있음
  public void growJava(Language language) { // Language 타입의 language 함수
    language.javaUp();
  }
}
