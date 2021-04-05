package net.puh.springboot.dao;

import net.puh.springboot.model.Weapon;

public interface WeaponDao {
  /**
   * Retrieves one weapon with no restriction to the size
   *
   * @return a random weapon
   */
  Weapon getRandomWeapon(int level);

  /**
   * Retrieves a random large weapon
   *
   * @param level the specified level by the user
   * @return a random primary weapon
   */
  Weapon getThreeSlotWeapon(int level);

  /**
   * Retrieves a medium slot weapon
   *
   * @param level the specified level by the user
   * @return a medium slot weapon
   */
  Weapon getTwoSlotWeapon(int level);

  /**
   * Retrieves a small slot weapon
   *
   * @param level the specified level by the user
   * @return a small slot weapon
   */
  Weapon getOneSlotWeapon(int level);

  /**
   * Retrieves a random weapon from the categories small or medium
   *
   * @param level the specified level by the user
   * @return a random small or medium slot weapon
   */
  Weapon getTwoOrOneSlotWeapon(int level);
}
