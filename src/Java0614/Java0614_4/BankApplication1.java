package Java0614.Java0614_4;

import Java0611.BankAccount;

public class BankApplication1 {
  public static void main(String[] args) {
    BankAccount1 account = new BankAccount1();
    try{
      account.withdraw(10000);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
