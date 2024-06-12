package Java0611.Daily_Quiz;

public class Main {
  public static void main(String[] args) {
    MyIntro myIntro = new MyIntro("석준", 24);
    Language language = new Language();

    myIntro.sayIntro(); // 이름과 나이 출력
    System.out.println(language.level); // 레벨이 몇인지 알려주는 코드
    myIntro.growJava(language); // 레벨이 올랐다는 문구 출력
    myIntro.growJava(language); // 레벨이 올랐다는 문구 출력
    myIntro.growJava(language); // 레벨이 올랐다는 문구 출력
    myIntro.growJava(language); // 레벨이 올랐다는 문구 출력
    System.out.println(language.level); // 레벨이 몇인지 알려주는 코드
  }
}
