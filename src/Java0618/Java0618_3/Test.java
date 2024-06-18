package Java0618.Java0618_3;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {

    ChildProduct<Tv, String, String> product = new ChildProduct<>();
    product.setKind(new Tv());
    product.setModel("smart Tv");
    product.setCompany("samsung");
    // Tv[100]
    StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
    tvStorage.add(new Tv(),0);


  }
}
