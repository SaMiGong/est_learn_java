package Java0619.Java0619_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentTest {
  public static void main(String[] args) {
    Map<Student, Integer> studentIntegerMap = new HashMap<>();

    studentIntegerMap.put(new Student(50, "홍길동"), 95);
    studentIntegerMap.put(new Student(50, "홍길동"), 95);

    System.out.println(studentIntegerMap.size());

    Set<Entry<Student, Integer>> entries = studentIntegerMap.entrySet();

    for (Entry<Student, Integer> entry : entries) {
      String name = entry.getKey().getName();
      int no = entry.getKey().getNo();
      Integer value = entry.getValue();
    }
  }
}
