package net.puh.springboot.dao;

import net.puh.springboot.mapper.ItemMapper;
import net.puh.springboot.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String SELECT_QUERY_CONSUMABLES = "SELECT * FROM FourRandomConsumables";
  private static final String SELECT_QUERY_TOOLS = "SELECT * FROM FourRandomTools";

  public List<Item> getRandomConsumables() {
    return template.query(SELECT_QUERY_CONSUMABLES, new ItemMapper());
  }

  public List<Item> getRandomTools() {
    return template.query(SELECT_QUERY_TOOLS, new ItemMapper());
  }
}
