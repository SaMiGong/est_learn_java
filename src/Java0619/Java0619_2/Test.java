package Java0619.Java0619_2;

import java.util.HashSet;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Set<Member> set = new HashSet<>();

    set.add(new Member("홍길동", 31));
    set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장

    System.out.println("총 객체수: " + set.size());
  }
}
