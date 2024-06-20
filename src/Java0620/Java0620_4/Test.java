package Java0620.Java0620_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    numbers.removeIf((integer)->integer % 2 == 0);

    System.out.println(numbers);


//    Iterator<Integer> iterator = numbers.iterator();

//    while (iterator.hasNext()) {
//      Integer next = iterator.next();
//      if (next % 2 == 0) {
//        iterator.remove();
//      }
//    }
//    System.out.println(numbers);
  }
}
