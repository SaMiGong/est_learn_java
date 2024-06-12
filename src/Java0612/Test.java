package Java0612;

public class Test {
  public static void main(String[] args) {
    SeongJo seongJo = new SeongJo(100, 5000);
    Food food = new Food(50, 30, "사탕");

    seongJo.buyFood(food);

    System.out.println(seongJo.money);
    System.out.println(seongJo.weight);
    System.out.println(seongJo.fat);
  }
}
