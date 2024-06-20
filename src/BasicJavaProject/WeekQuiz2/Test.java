package BasicJavaProject.WeekQuiz2;

public class Test {
  public static void main(String[] args) {
    ShoppingMall mall = new PremiumShoppingMall(10);

    Product shirt1 = new Clothing("티셔츠", 20, 20, "L");
    Product phone1 = new Electronics("애플폰", 999, 10, "Apple");
    Product phone2 = new Electronics("삼성폰", 888, 10, "samsung");
    Product meat1 = new Food("돼지고기", 9, 20, 5);

    mall.addProduct(shirt1); // 티셔츠 제품
    mall.addProduct(phone1); // 폰 제품
    mall.addProduct(phone2); // 폰 제품
    mall.addProduct(meat1); // 고기 제품

    // 제품 목록 출력
    mall.displayProducts();

    System.out.println(""); // 띄워주기

    System.out.println("티셔츠 주문가능 여부: " + mall.checkOrderAvailability(shirt1));
    System.out.println("폰 주문가능 여부: " + mall.checkOrderAvailability(phone1));
    System.out.println("폰 주문가능 여부: " + mall.checkOrderAvailability(phone2));
    System.out.println("고기 주문가능 여부: " + mall.checkOrderAvailability(meat1));

    System.out.println("");

    System.out.println("결제할 가격");
    System.out.println("티셔츠의 가격: " + shirt1.calculatePrice());
    System.out.println("애플폰의 가격: " + phone1.calculatePrice());
    System.out.println("삼성폰의 가격: " + phone2.calculatePrice());
    System.out.println("돼지고기의 가격: " + meat1.calculatePrice());

    System.out.println(""); // 띄워주기

    System.out.println("애플폰 제거");
    mall.removeProduct(phone1);

    System.out.println("제거 후 상품");
    mall.displayProducts();
  }
}
