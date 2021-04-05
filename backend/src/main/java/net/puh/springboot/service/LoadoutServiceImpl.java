package net.puh.springboot.service;

import net.puh.springboot.dao.ItemDao;
import net.puh.springboot.dao.WeaponDao;
import net.puh.springboot.model.Loadout;
import net.puh.springboot.model.Weapon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoadoutServiceImpl implements LoadoutService {
  @Resource private WeaponDao weaponDao;
  @Resource private ItemDao itemDao;

  @Override
  public Loadout getRandomLoadout() {
    Weapon primary = weaponDao.getRandomWeapon();
    System.out.println("PRIMARY > " + primary.getSize());
    Weapon secondary;
    switch (primary.getSize()) {
      case 1:
        secondary = weaponDao.getRandomWeapon();
        break;
      case 2:
        secondary = weaponDao.getTwoOrOneSlotWeapon();
        break;
      case 3:
        secondary = weaponDao.getOneSlotWeapon();
        break;
      default:
        secondary = null;
    }
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(), itemDao.getRandomConsumables());
  }

  @Override
  public Loadout getRandomFullLoadout() {
    Weapon primary = weaponDao.getRandomWeapon();
    Weapon secondary;
    switch (primary.getSize()) {
      case 1:
        secondary = weaponDao.getThreeSlotWeapon();
        break;
      case 2:
        secondary = weaponDao.getTwoSlotWeapon();
        break;
      case 3:
        secondary = weaponDao.getOneSlotWeapon();
        break;
      default:
        secondary = null;
    }
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(), itemDao.getRandomConsumables());
  }
}
