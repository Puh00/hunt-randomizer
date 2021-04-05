package net.puh.springboot.dao;

import net.puh.springboot.mapper.ConsumableMapper;
import net.puh.springboot.model.Consumable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsumableDaoImpl implements ItemDao<Consumable> {
  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_CONSUMABLES = "SELECT * FROM FourRandomConsumables";

  @Override
  public List<Consumable> getRandomItems() {
    return template.query(QUERY_CONSUMABLES, new ConsumableMapper());
  }
}
