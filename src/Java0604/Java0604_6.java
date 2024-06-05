package Java0604;

public class Java0604_6 {
  public static void main(String[] args) {

    //    int number = 0;
    //
    //    while (number < 10) {
    //      number++;
    //      if (number == 3) {
    //        continue;
    //      } else {
    //        System.out.println("현재 값은 : " + number);
    //      }
    //    }

    //    for (int i = 0; i < 10; i++) {
    //      if (i == 5) {
    //        break;
    //      }
    //      for (int j = 0; j < 10; j++) {
    //        if (j == 5) {
    //          continue;
    //        }
    //        System.out.println(j);
    //      }
    //    }

    //    for(int i = 0; i <= 10;i++) {
    //      if (i == 4 || i == 7){
    //        continue;
    //      }
    //      System.out.println(i);
    //    }

    //    int sum = 0;
    //    double avg = 0;
    //    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    //    for (int i : scores) {
    //      sum += i;
    //      avg = (double) sum / scores.length;
    //    }
    //    System.out.println("합계: " + sum);
    //    System.out.println("평균: " + avg);

    //    String[] names = {"okay2", "asbds", "good2", "romiiiii", "abcde"};
    //    for (String i : names){
    //      if (names.length >= 5){
    //        System.out.println(i);
    //      }
    //    }

    //    int i = 0; // 초기화식
    //
    //    while(i < 10){
    //      if(i == 5){
    //        continue;
    //      }
    //      System.out.println(i);
    //      i++; // 증감식
    //    }

    //    int count = 1;
    //    while (count <= 10000) {
    //      System.out.println(count);
    //      count++;
    //    }

    for (int i = 9; i > 1; i--) {
      System.out.println(i + "단");
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }
  }
}
