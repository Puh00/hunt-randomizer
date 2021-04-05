package net.puh.springboot.dao;

import net.puh.springboot.mapper.ItemMapper;
import net.puh.springboot.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String SELECT_QUERY_CONSUMABLE = "SELECT * FROM RandomConsumable";
  private static final String SELECT_QUERY_TOOLS = "SELECT * FROM FourRandomTools";
  private static final ItemMapper mapper = new ItemMapper();

  public List<Item> getRandomConsumables() {
    List<Item> consumables = new ArrayList<>();
    // Since duplicates are allowed
    for (int i = 0; i < 4; i++) consumables.addAll(template.query(SELECT_QUERY_CONSUMABLE, mapper));
    return consumables;
  }

  public List<Item> getRandomTools() {
    return template.query(SELECT_QUERY_TOOLS, mapper);
  }
}
