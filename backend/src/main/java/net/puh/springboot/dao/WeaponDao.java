package net.puh.springboot.dao;

import net.puh.springboot.model.Weapon;

public interface WeaponDao {
  /**
   * Retrieves one weapon with no restriction to the size
   *
   * @return a random weapon
   */
  Weapon getRandomWeapon();

  /**
   * Retrieves a random large weapon
   *
   * @return a random primary weapon
   */
  Weapon getThreeSlotWeapon();

  /**
   * Retrieves a medium slot weapon
   *
   * @return a medium slot weapon
   */
  Weapon getTwoSlotWeapon();

  /**
   * Retrieves a small slot weapon
   *
   * @return a small slot weapon
   */
  Weapon getOneSlotWeapon();

  /**
   * Retrieves a random weapon from the categories small or medium
   *
   * @return a random small or medium slot weapon
   */
  Weapon getTwoOrOneSlotWeapon();
}
