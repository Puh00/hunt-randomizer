package net.puh.springboot.dao;

import net.puh.springboot.mapper.WeaponMapper;
import net.puh.springboot.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class WeaponDaoImpl implements WeaponDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_WEAPON = "SELECT * FROM RandomWeapon";

  @Override
  public Weapon getRandomWeapon() {
    List<Weapon> weapons = template.query(QUERY_WEAPON, new WeaponMapper());
    return weapons.get(0);
  }
}
