package net.puh.springboot.mapper;

import net.puh.springboot.model.Tool;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ToolMapper implements RowMapper<Tool> {
  @Override
  public Tool mapRow(ResultSet resultSet, int i) throws SQLException {
    Tool tl = new Tool();
    tl.setName(resultSet.getString("name"));
    tl.setPrice(resultSet.getInt("price"));
    tl.setUnlockLevel(resultSet.getInt("unlock_level"));
    return tl;
  }
}
