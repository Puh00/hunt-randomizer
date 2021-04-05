package net.puh.springboot.dao;

import net.puh.springboot.model.Item;

import java.util.List;

public interface ItemDao {
  /**
   * Retrieves 4 random consumables (duplicates may occur)
   *
   * @param level the specified level by the user
   * @return 4 random consumables
   */
  List<Item> getRandomConsumables(int level);

  /**
   * Retrieves 1 random tool
   *
   * @param level the specified level by the user
   * @return 1 random tool
   */
  List<Item> getRandomTools(int level);
}
