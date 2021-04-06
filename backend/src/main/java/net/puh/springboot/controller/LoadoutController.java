package net.puh.springboot.controller;

import net.puh.springboot.model.Loadout;
import net.puh.springboot.service.LoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/")
public class LoadoutController {

  @Autowired LoadoutService loadoutService;

  @GetMapping("random/{quart}/{full}/{level}")
  public Loadout getRandomLoadout(
      @PathVariable boolean quart, @PathVariable boolean full, @PathVariable int level) {
    // check if the quartermaster trait is on and if a full loadout is required
    if (quart)
      return full
          ? loadoutService.getRandomFullQuarterMasterLoadout(level)
          : loadoutService.getRandomQuarterMasterLoadout(level);
    else
      return full
          ? loadoutService.getRandomFullLoadout(level)
          : loadoutService.getRandomLoadout(level);
  }
}
