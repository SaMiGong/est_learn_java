package Java0618.Java0618_3;

public class Product<T, M> {
  private T kind;
  private M model;

  // 프라이빗으로 막혀있는데 getter로 외부에서 읽을 수 있게 만듬
  public T getKind() {
    return kind;
  }

  public M getModel() {
    return model;
  }

  public void setKind(T kind) {
    this.kind = kind;
  }

  public void setModel(M model) {
    this.model = model;
  }
}
