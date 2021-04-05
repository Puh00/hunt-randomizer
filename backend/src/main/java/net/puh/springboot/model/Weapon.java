package net.puh.springboot.model;

public class Weapon {
  private String name;
  private int size;
  private int price;
  private int unlockLevel;

  public Weapon() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
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
