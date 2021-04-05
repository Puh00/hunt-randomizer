package net.puh.springboot.dao;

import net.puh.springboot.model.Item;

import java.util.List;

public interface ItemDao {
  /**
   * Retrieves 4 random consumables (duplicates may occur)
   *
   * @return 4 random consumables
   */
  List<Item> getRandomConsumables();

  /**
   * Retrieves 1 random tool
   *
   * @return 1 random tool
   */
  List<Item> getRandomTools();
}
