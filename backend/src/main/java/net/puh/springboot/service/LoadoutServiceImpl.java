package net.puh.springboot.service;

import net.puh.springboot.dao.WeaponDao;
import net.puh.springboot.model.Loadout;
import net.puh.springboot.model.Weapon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoadoutServiceImpl implements LoadoutService{
  @Resource private WeaponDao weaponDao;

  @Override
  public Loadout getRandomLoadout() {
    Weapon primary = weaponDao.getRandomWeapon();
    Weapon secondary = weaponDao.getRandomWeapon();
    Loadout ld = new Loadout();
    ld.setPrimary(primary);
    ld.setSecondary(secondary);
    return ld;
  }
}
