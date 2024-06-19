package Java0619.Java0619_1;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
  public static void main(String[] args) {
    HashSet<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);
    //    System.out.println(integerSet.size()); // 중복을 허용하지 않기때문에 1
    Iterator<Integer> iterator = integerSet.iterator();

    //    while (iterator.hasNext()) {
    //      System.out.println(iterator.next());
    //    }

    while (iterator.hasNext()) {
      iterator.next();
      iterator.remove();
    }

    for (int a : integerSet) {
      System.out.println(a);
    }
  }
}
