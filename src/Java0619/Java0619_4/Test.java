package Java0619.Java0619_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
  public static void main(String[] args) {

    Map<String, List<String>> map = new HashMap<>();
    List<String> stringList = new ArrayList<>();
    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map.put("홍길동", stringList);

    Set<Entry<String, List<String>>> entries = map.entrySet();

    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println(key);
      System.out.println("=========");
      System.out.println(value);
    }
  }
}
