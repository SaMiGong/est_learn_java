package BasicJavaProject.WeekQuiz2;

public abstract class ShoppingMall {
  private Product[] products;
  private int count;

  public ShoppingMall(int size) {
    products = new Product[size];
    count = 0;
  }

  public void addProduct(Product product) {
    if (count == products.length) {
      Product[] newProducts = new Product[products.length * 2];
      for (int i = 0; i < products.length; i++) {
        newProducts[i] = products[i];
      }
      products = newProducts;
    }
  }

  public void removeProduct(Product product) {
    for (int i = 0; i < products.length; i++) {
      if (products[i].equals(product)) {
        products[i] = null;
      }
    }
  }

  public void displayProducts() {
    for (int i = 0; i < products.length; i++) {
      System.out.println(
          "제품 이름: "
              + products[i].getName()
              + "제품 가격: "
              + products[i].getPrice()
              + "제고량: "
              + products[i].getStock());
    }
  }

  public abstract boolean checkOrderAvailability(Product product);
}
