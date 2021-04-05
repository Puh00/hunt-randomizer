package net.puh.springboot.model;

import java.util.List;

public class Loadout {
  private Weapon primary;
  private Weapon secondary;
  private List<Tool> tools;
  private List<Consumable> consumables;

  public Loadout() {
    super();
  }

  public Loadout(Weapon primary, Weapon secondary, List<Tool> tools, List<Consumable> consumables) {
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

  public List<Tool> getTools() {
    return tools;
  }

  public void setTools(List<Tool> tools) {
    this.tools = tools;
  }

  public List<Consumable> getConsumables() {
    return consumables;
  }

  public void setConsumables(List<Consumable> consumables) {
    this.consumables = consumables;
  }
}
