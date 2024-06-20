package BasicJavaProject.WeekQuiz2;

public class Clothing extends Product {
  private String size;

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }



  @Override
  public double calculatePrice() {
    if (size.equals("L") || size.equals("XL")) {
      return getPrice() * 1.1; // 10퍼 추가
    }
    return getPrice();
  }
}
