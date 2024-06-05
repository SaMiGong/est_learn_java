package Java0605;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Java0605_4 {
  public static void main(String[] args) {
    //    Random random = new Random();
    //    int i = random.nextInt();
    //    System.out.println(i);

    //    Random rand = new Random(46);
    //    ArrayList<Integer> list = new ArrayList<Integer>();
    ////    Set<Integer> set = new HashSet<Integer>();
    ////    int->Integer;
    ////    boolean->Boolean;
    ////    double->Double;
    // while(list.size()!=6){
    //  int nubmer = rand.nextInt(45)+1;
    //
    //  if(!list.contains(nubmer)){
    //    list.add(nubmer);
    //    }
    //    for(int data:list){
    //        System.out.println(data);
    //    }
    //    }

    Random random = new Random();

    ArrayList<Integer> list = new ArrayList<Integer>();

    while (list.size() != 6) {
      int number = random.nextInt(45) + 1;

      if (!list.contains(number)) { // 리스트에 없다면
        list.add(number); // 추가
      }
    }

    for (int data : list) {
      System.out.println(data);
    }
  }
}
