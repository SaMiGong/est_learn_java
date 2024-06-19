package Java0619.Java0619_3;

import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 30);
    map.put("홍길동", 40); // 값이 덮어씌워진다.

    System.out.println(map.get("홍길동"));
    System.out.println(map.remove("홍길동"));
  }
}
