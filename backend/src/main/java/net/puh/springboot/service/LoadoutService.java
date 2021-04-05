package net.puh.springboot.service;

import net.puh.springboot.model.Loadout;

public interface LoadoutService {
  /**
   * There's a chance that the randomly generated loadout won't use all of the 4 slots
   *
   * @param level level of the account
   * @return a randomly generated loadout
   */
  Loadout getRandomLoadout(int level);

  /**
   * The randomly generated loadout will use all of the slots := primary.size + secondary.size = 4
   *
   * @param level level of the account
   * @return a randomly generated loadout
   */
  Loadout getRandomFullLoadout(int level);

  /**
   * Randomly generated loadout with the quartermaster trait on. There's a chance that the randomly
   * generated loadout won't use all of the 5 slots
   *
   * @param level level of the account
   * @return a randomly generated loadout
   */
  Loadout getRandomQuarterMasterLoadout(int level);

  /**
   * Ensures a random loadout containing a large and a medium slot weapon
   *
   * @param level level of the account
   * @return a randomly generated loudout
   */
  Loadout getRandomFullQuarterMasterLoadout(int level);
}
