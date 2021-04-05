package net.puh.springboot.mapper;

import net.puh.springboot.model.Consumable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsumableMapper implements RowMapper<Consumable> {
  @Override
  public Consumable mapRow(ResultSet resultSet, int i) throws SQLException {
    Consumable cs = new Consumable();
    cs.setName(resultSet.getString("name"));
    cs.setPrice(resultSet.getInt("price"));
    cs.setUnlockLevel(resultSet.getInt("unlock_level"));
    return cs;
  }
}
