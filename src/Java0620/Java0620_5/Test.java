package Java0620.Java0620_5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    //    List<Integer> numbers1 =
    //        numbers.stream().filter(list -> list % 2 != 0).collect(Collectors.toList());
    //    System.out.println(numbers1);
    numbers.stream().filter(a -> a % 2 == 1).forEach(a -> System.out.println(a));


    //    numbers.stream();
    //    int[] array = {1, 2, 3, 4, 5};
    //    Arrays Array = null;
    //    IntStream stream = Array.stream(array);
    //    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

    //    numbers.stream().filter(integer -> integer % 2 == 0);
    //    numbers.stream().map(integer -> integer * 2);
    //    numbers.stream().sorted();
    //    numbers.stream()
    //        .filter(integer -> integer % 2 == 0)
    //        .forEach(integer -> System.out.println(integer));
    //    List<Integer> collect =
    //        numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());
    //
    //    for (int i : collect) {
    //      System.out.println(i);
    //
    //      numbers.stream().sorted();
    //    }
  }
}
