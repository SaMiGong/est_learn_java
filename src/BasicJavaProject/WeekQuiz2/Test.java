package BasicJavaProject.WeekQuiz2;

public class Test {
  public static void main(String[] args) {
    ShoppingMall mall = new PremiumShoppingMall(10);

    Product shirt = new Clothing("티셔츠", 20, 15, "L");
    Product phone = new Electronics("Phone", 999, 3, "Apple");
    Product meat = new Food("pig", 9, 20, 5);

    mall.addProduct(shirt);
    mall.addProduct(phone);
    mall.addProduct(meat);

    mall.displayProducts();

    System.out.println("티셔츠 주문가능 여부: " + mall.checkOrderAvailability(shirt));
    System.out.println("폰 주문가능 여부: " + mall.checkOrderAvailability(phone));
    System.out.println("고기 주문가능 여부: " + mall.checkOrderAvailability(meat));
  }
}
