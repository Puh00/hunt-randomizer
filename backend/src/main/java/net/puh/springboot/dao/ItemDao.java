package net.puh.springboot.dao;

import net.puh.springboot.model.Item;

import java.util.List;

public interface ItemDao {
  /**
   * Retrieves 4 random consumables (duplicates may occur)
   * @return 4 random consumables
   */
  List<Item> getRandomConsumables();

  /**
   * Retrieves 4 random tools with no duplicates
   * @return
   */
  List<Item> getRandomTools();
}
