package net.puh.springboot.dao;

import net.puh.springboot.mapper.ToolMapper;
import net.puh.springboot.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToolDaoImpl implements ItemDao<Tool> {
  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_TOOLS = "SELECT * FROM FourRandomTools";

  @Override
  public List<Tool> getRandomItems() {
    return template.query(QUERY_TOOLS, new ToolMapper());
  }
}
