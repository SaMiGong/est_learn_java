package BasicJavaProject.WeekQuiz2;

public abstract class ShoppingMall {
  private Product[] products; // 상품배열
  private int count; // 현재 상품 수

  public ShoppingMall(int size) {
    products = new Product[size];
    count = 0;
  }

  public void addProduct(Product product) {
    if (count == products.length) { // 배열의 길이만큼 제품이 추가되면 새로운 배열생성
      Product[] newProducts = new Product[products.length * 2];
      // 배열을 두배로 만든 후 새로운 배열로 복사
      for (int i = 0; i < products.length; i++) {
        newProducts[i] = products[i];
      }
      // 기존배열을 새로만든 배열로 바꿈
      products = newProducts;
    }
    // 새로운 제품을 배열에 추가 후 제품 수를 증가
    products[count++] = product;
  }

  public void removeProduct(Product product) {
    for (int i = 0; i < products.length; i++) {
      if (products[i] != null && products[i].equals(product)) {
        products[i] = null;
        break;
      }
    }
  }

  public void displayProducts() {
    for (int i = 0; i < products.length; i++) {
      if (products[i] != null) {

        System.out.println(
            "제품 이름: "
                + products[i].getName()
                + ", 제품 가격: "
                + products[i].getPrice()
                + ", 재고량: "
                + products[i].getStock());
      }
    }
  }

  public Product[] getProducts() {
    return products;
  }

  public int getProductsCount() {
    return count;
  }

  public abstract boolean checkOrderAvailability(Product product); // 주문 가능 여부 확인
}
