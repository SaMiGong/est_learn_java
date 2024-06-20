package BasicJavaProject.WeekQuiz2;

public class Electronics extends Product {
  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  private String brand;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public double CalculatePrice() {
    if (brand.equals("Apple")) {
      return getPrice() * 1.2; // 20퍼 추가
    }
    return getPrice();
  }
}
