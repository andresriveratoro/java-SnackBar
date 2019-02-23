package javaSnackBar;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public String getName() {
    return name;
  }

  public double getCash() {
    return cash;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddCash(double cash) {
    this.cash += cash;
    System.out.println("You have $" + this.cash + " on hand.");
  }

  public void setSubtractCash(double cash) {
    this.cash -= cash;
  }

  public void buy(Snack snack, int quantity) {
    double cost = snack.getTotalCost(quantity);
    this.cash -= cost;
    snack.setSubtractQuantity(quantity);
    System.out.println("You have $" + this.cash + " on hand after buying " + quantity +
      " " + snack.getName() + ".");
    System.out.println("There are " + snack.getQuantity() + " " + snack.getName() +
      " remaining in the vending machine.");
  }
}
