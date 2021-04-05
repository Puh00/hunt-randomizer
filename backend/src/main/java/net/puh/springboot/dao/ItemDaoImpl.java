package net.puh.springboot.dao;

import net.puh.springboot.mapper.ItemMapper;
import net.puh.springboot.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_CONSUMABLE =
      "SELECT * FROM Consumables WHERE unlock_level <=:level ORDER BY RANDOM() LIMIT 1";
  private static final String QUERY_FOUR_TOOLS =
      "SELECT * FROM Tools WHERE unlock_level <=:level ORDER BY RANDOM() LIMIT 4";
  private static final ItemMapper mapper = new ItemMapper();

  public List<Item> getRandomConsumables(int level) {
    List<Item> consumables = new ArrayList<>();
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    // Since duplicates are allowed
    for (int i = 0; i < 4; i++) consumables.addAll(template.query(QUERY_CONSUMABLE, param, mapper));
    return consumables;
  }

  public List<Item> getRandomTools(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_FOUR_TOOLS, param, mapper);
  }
}
