package net.puh.springboot.controller;

import net.puh.springboot.model.Loadout;
import net.puh.springboot.service.LoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/v1/")
public class LoadoutController {

  @Autowired LoadoutService loadoutService;

  @GetMapping("random-loadout")
  public Loadout getRandomLoadout() {
    return loadoutService.getRandomLoadout();
  }
}
