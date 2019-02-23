package javaSnackBar;

public class Main {
  public static void main(String[] args) {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine vm1 = new VendingMachine("food");
    VendingMachine vm2 = new VendingMachine("drink");
    VendingMachine vm3 = new VendingMachine("office");

    Snack s1 = new Snack("chips", 36, 1.75, vm1.getId());
    Snack s2 = new Snack("chocolate", 36, 1.00, vm1.getId());
    Snack s3 = new Snack("pretzel", 30, 2.00, vm1.getId());
    Snack s4 = new Snack("soda", 24, 2.50, vm2.getId());
    Snack s5 = new Snack("water", 20, 2.75, vm2.getId());

    c1.buy(s4, 3);
    c1.buy(s3, 1);
    c2.buy(s4, 2);
    c1.setAddCash(10.00);
    c1.buy(s2, 1);
    s3.setAddQuantity(12);
    c2.buy(s3, 3);
  }
}
