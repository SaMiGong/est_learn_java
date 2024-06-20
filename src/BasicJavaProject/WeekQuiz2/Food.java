package BasicJavaProject.WeekQuiz2;

public class Food extends Product {
  private int expirationDate;

  public Food(String name, int price, int stock, int expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  public int getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(int expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public double CalculatePrice() {
    if (expirationDate <= 7) {
      return getPrice() * 0.8; // 20퍼 할인
    }
    return getPrice();
  }
}
