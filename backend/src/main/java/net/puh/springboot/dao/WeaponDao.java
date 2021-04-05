package net.puh.springboot.dao;

import net.puh.springboot.model.Weapon;

public interface WeaponDao {
  Weapon getRandomWeapon();

  Weapon getThreeSlotWeapon();

  Weapon getTwoSlotWeapon();

  Weapon getOneSlotWeapon();

  Weapon getTwoOrOneSlotWeapon();
}
