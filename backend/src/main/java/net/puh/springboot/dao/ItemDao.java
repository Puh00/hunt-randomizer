package net.puh.springboot.dao;

import net.puh.springboot.model.Item;

import java.util.List;

public interface ItemDao {
  List<Item> getRandomConsumables();

  List<Item> getRandomTools();
}
