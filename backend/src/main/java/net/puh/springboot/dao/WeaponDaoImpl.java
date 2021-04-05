package net.puh.springboot.dao;

import net.puh.springboot.mapper.WeaponMapper;
import net.puh.springboot.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class WeaponDaoImpl implements WeaponDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_RANDOM_WEAPON =
      "SELECT * FROM Weapons WHERE unlock_level <=:level ORDER BY RANDOM() LIMIT 1";
  private static final String QUERY_LARGE_WEAPON =
      "SELECT * FROM Weapons WHERE unlock_level <=:level AND size = 3 ORDER BY RANDOM() LIMIT 1";
  private static final String QUERY_MEDIUM_WEAPON =
      "SELECT * FROM Weapons WHERE unlock_level <=:level AND size = 2 ORDER BY RANDOM() LIMIT 1";
  private static final String QUERY_SMALL_WEAPON =
      "SELECT * FROM Weapons WHERE unlock_level <=:level AND size = 1 ORDER BY RANDOM() LIMIT 1";
  private static final String QUERY_MEDIUM_SMALL_WEAPON =
      "SELECT * FROM Weapons WHERE unlock_level <=:level AND size <= 2 ORDER BY RANDOM() LIMIT 1";
  private static final WeaponMapper mapper = new WeaponMapper();

  @Override
  public Weapon getRandomWeapon(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_RANDOM_WEAPON, param, mapper).get(0);
  }

  @Override
  public Weapon getThreeSlotWeapon(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_LARGE_WEAPON, param, mapper).get(0);
  }

  @Override
  public Weapon getTwoSlotWeapon(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_MEDIUM_WEAPON, param, mapper).get(0);
  }

  @Override
  public Weapon getOneSlotWeapon(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_SMALL_WEAPON, param, mapper).get(0);
  }

  @Override
  public Weapon getTwoOrOneSlotWeapon(int level) {
    SqlParameterSource param = new MapSqlParameterSource().addValue("level", level);
    return template.query(QUERY_MEDIUM_SMALL_WEAPON, param, mapper).get(0);
  }
}
