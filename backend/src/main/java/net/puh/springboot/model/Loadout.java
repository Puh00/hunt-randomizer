package net.puh.springboot.model;

public class Loadout {
  private Weapon primary;
  private Weapon secondary;

  public Loadout() {
    super();
  }

  public Weapon getPrimary() {
    return primary;
  }

  public void setPrimary(Weapon primary) {
    this.primary = primary;
  }

  public Weapon getSecondary() {
    return secondary;
  }

  public void setSecondary(Weapon secondary) {
    this.secondary = secondary;
  }
}
