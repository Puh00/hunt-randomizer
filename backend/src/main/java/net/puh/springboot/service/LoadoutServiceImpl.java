package net.puh.springboot.service;

import net.puh.springboot.dao.ItemDao;
import net.puh.springboot.dao.WeaponDao;
import net.puh.springboot.model.Item;
import net.puh.springboot.model.Loadout;
import net.puh.springboot.model.Weapon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoadoutServiceImpl implements LoadoutService {
  @Resource private WeaponDao weaponDao;
  @Resource private ItemDao itemDao;

  @Override
  public Loadout getRandomLoadout() {
    // Retrieve stuff from db
    Weapon primary = weaponDao.getRandomWeapon();
    Weapon secondary = weaponDao.getRandomWeapon();
    // List<Tool> tools = toolDao.getRandomItems();
    // List<Consumable> consumables = consumableDao.getRandomItems();
    List<Item> tools = itemDao.getRandomTools();
    List<Item> consumables = itemDao.getRandomConsumables();
    return new Loadout(primary, secondary, tools, consumables);
  }
}
