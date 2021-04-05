package net.puh.springboot.mapper;

import net.puh.springboot.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<Item> {
  @Override
  public Item mapRow(ResultSet resultSet, int i) throws SQLException {
    Item it = new Item();
    it.setName(resultSet.getString("name"));
    it.setPrice(resultSet.getInt("price"));
    it.setUnlockLevel(resultSet.getInt("unlock_level"));
    return it;
  }
}
