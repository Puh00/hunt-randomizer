package net.puh.springboot.mapper;

import net.puh.springboot.model.Weapon;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WeaponMapper implements RowMapper<Weapon> {
  @Override
  public Weapon mapRow(ResultSet resultSet, int i) throws SQLException {
    Weapon wp = new Weapon();
    wp.setName(resultSet.getString("name"));
    wp.setSize(resultSet.getInt("size"));
    wp.setPrice(resultSet.getInt("price"));
    wp.setUnlockLevel(resultSet.getInt("unlock_level"));
    return wp;
  }
}
