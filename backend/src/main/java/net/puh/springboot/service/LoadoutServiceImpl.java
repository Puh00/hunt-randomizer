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
  public Loadout getRandomLoadout(int level) {
    Weapon primary = weaponDao.getRandomWeapon(level);
    Weapon secondary;
    switch (primary.getSize()) {
      case 1:
        secondary = weaponDao.getRandomWeapon(level);
        break;
      case 2:
        secondary = weaponDao.getTwoOrOneSlotWeapon(level);
        break;
      case 3:
        secondary = weaponDao.getOneSlotWeapon(level);
        break;
      default:
        secondary = null;
    }
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(level), itemDao.getRandomConsumables(level));
  }

  @Override
  public Loadout getRandomFullLoadout(int level) {
    Weapon primary = weaponDao.getRandomWeapon(level);
    Weapon secondary;
    switch (primary.getSize()) {
      case 1:
        secondary = weaponDao.getThreeSlotWeapon(level);
        break;
      case 2:
        secondary = weaponDao.getTwoSlotWeapon(level);
        break;
      case 3:
        secondary = weaponDao.getOneSlotWeapon(level);
        break;
      default:
        secondary = null;
    }
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(level), itemDao.getRandomConsumables(level));
  }

  @Override
  public Loadout getRandomQuarterMasterLoadout(int level) {
    Weapon primary = weaponDao.getRandomWeapon(level);
    Weapon secondary;
    switch (primary.getSize()) {
      case 1:
      case 2:
        secondary = weaponDao.getRandomWeapon(level);
        break;
      case 3:
        secondary = weaponDao.getTwoOrOneSlotWeapon(level);
        break;
      default:
        secondary = null;
    }
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(level), itemDao.getRandomConsumables(level));
  }

  @Override
  public Loadout getRandomFullQuarterMasterLoadout(int level) {
    Weapon primary = weaponDao.getThreeSlotWeapon(level);
    Weapon secondary = weaponDao.getTwoSlotWeapon(level);
    return new Loadout(
        primary, secondary, itemDao.getRandomTools(level), itemDao.getRandomConsumables(level));
  }
}
