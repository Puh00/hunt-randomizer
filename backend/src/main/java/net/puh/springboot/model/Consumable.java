package net.puh.springboot.model;

public class Consumable {
  private String name;
  private int price;
  private int unlockLevel;

  public Consumable() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getUnlockLevel() {
    return unlockLevel;
  }

  public void setUnlockLevel(int unlockLevel) {
    this.unlockLevel = unlockLevel;
  }
}
