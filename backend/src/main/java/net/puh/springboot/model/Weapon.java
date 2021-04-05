package net.puh.springboot.model;

public class Weapon {
  private String name;
  private int size;
  private int price;
  private int unlock_level;

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

  public int getUnlock_level() {
    return unlock_level;
  }

  public void setUnlock_level(int unlock_level) {
    this.unlock_level = unlock_level;
  }
}
