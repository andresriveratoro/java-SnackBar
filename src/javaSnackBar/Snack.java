package javaSnackBar;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getTotalCost(int quantity) {
    return cost * quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void setSubtractQuantity(int quantity) {
    this.quantity -= quantity;
  }
}
