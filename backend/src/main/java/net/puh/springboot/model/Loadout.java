package net.puh.springboot.model;

import java.util.List;

public class Loadout {
  private Weapon primary;
  private Weapon secondary;
  private List<Item> tools;
  private List<Item> consumables;

  public Loadout() {
    super();
  }

  public Loadout(Weapon primary, Weapon secondary, List<Item> tools, List<Item> consumables) {
    this.primary = primary;
    this.secondary = secondary;
    this.tools = tools;
    this.consumables = consumables;
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

  public List<Item> getTools() {
    return tools;
  }

  public void setTools(List<Item> tools) {
    this.tools = tools;
  }

  public List<Item> getConsumables() {
    return consumables;
  }

  public void setConsumables(List<Item> consumables) {
    this.consumables = consumables;
  }
}
