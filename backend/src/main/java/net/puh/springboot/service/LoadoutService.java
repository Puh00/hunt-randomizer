package net.puh.springboot.service;

import net.puh.springboot.model.Loadout;

public interface LoadoutService {
  /**
   * There's a chance that the randomly generated loadout won't use all of the 5 slots
   *
   * @return a randomly generated loadout
   */
  Loadout getRandomLoadout();

  /**
   * The randomly generated loadout will use all of the slots := primary.size + secondary.size = 5
   *
   * @return a randomly generated loadout
   */
  Loadout getRandomFullLoadout();
}
