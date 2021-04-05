package net.puh.springboot.dao;

import net.puh.springboot.mapper.WeaponMapper;
import net.puh.springboot.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WeaponDaoImpl implements WeaponDao {

  @Autowired private NamedParameterJdbcTemplate template;
  private static final String QUERY_RANDOM_WEAPON = "SELECT * FROM RandomWeapon";
  private static final String QUERY_LARGE_WEAPON = "SELECT * FROM RandomLargeWeapon";
  private static final String QUERY_MEDIUM_WEAPON = "SELECT * FROM RandomMediumWeapon";
  private static final String QUERY_SMALL_WEAPON = "SELECT * FROM RandomSmallWeapon";
  private static final String QUERY_MEDIUM_SMALL_WEAPON = "SELECT * FROM RandomMediumSmallWeapon";
  private static final WeaponMapper mapper = new WeaponMapper();

  @Override
  public Weapon getRandomWeapon() {
    return template.query(QUERY_RANDOM_WEAPON, mapper).get(0);
  }

  @Override
  public Weapon getThreeSlotWeapon() {
    return template.query(QUERY_LARGE_WEAPON, mapper).get(0);
  }

  @Override
  public Weapon getTwoSlotWeapon() {
    return template.query(QUERY_MEDIUM_WEAPON, mapper).get(0);
  }

  @Override
  public Weapon getOneSlotWeapon() {
    return template.query(QUERY_SMALL_WEAPON, mapper).get(0);
  }

  @Override
  public Weapon getTwoOrOneSlotWeapon() {
    return template.query(QUERY_MEDIUM_SMALL_WEAPON, mapper).get(0);
  }
}
