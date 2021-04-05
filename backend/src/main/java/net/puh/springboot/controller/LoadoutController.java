package net.puh.springboot.controller;

import net.puh.springboot.model.Loadout;
import net.puh.springboot.service.LoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/v1/")
public class LoadoutController {

  @Autowired LoadoutService loadoutService;

  @GetMapping("random/{quart}/{full}")
  public Loadout getRandomLoadout(@PathVariable boolean quart, @PathVariable boolean full) {
    // check if the quartermaster trait is on, if a full loadout is required and act accordingly
    if (quart)
      return full
          ? loadoutService.getRandomFullQuarterMasterLoadout()
          : loadoutService.getRandomQuarterMasterLoadout();
    else return full ? loadoutService.getRandomFullLoadout() : loadoutService.getRandomLoadout();
  }
}
