package net.puh.springboot.controller;

import net.puh.springboot.model.Item;
import net.puh.springboot.model.Loadout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LoadoutControllerIntegrationTest {
  @Autowired private TestRestTemplate restTemplate;

  @Test
  public void getRandomLoadout() {
    // Check random loadout
    validateLoadouts(false, false, 4);
    // Check random full loadout
    validateLoadouts(false, true, 4);
    // Check random quartermaster loadout
    validateLoadouts(true, false, 5);
    // Check random full quartermaster loadout
    validateLoadouts(true, true, 5);
  }

  private void validateLoadouts(boolean quart, boolean full, int slotSize) {
    Random rnd = new Random(System.nanoTime());
    Loadout ld;
    int level;

    for (int i = 0; i < 200; i++) {
      // Bounds [1, 100]
      level = rnd.nextInt(101 - 1) + 1;
      // retrieve a loadout through a GET request
      String url = "/v1/random/" + quart + "/" + full + "/" + level;
      ld = restTemplate.getForEntity(url, Loadout.class).getBody();

      // The size combined of the two weapons must be less than {@slotSize}
      assertThat(
          ld.getPrimary().getSize() + ld.getSecondary().getSize(), is(lessThanOrEqualTo(slotSize)));

      // The specified level must be greater than the unlockLevel of an item
      assertThat(ld.getPrimary().getUnlockLevel(), is(lessThanOrEqualTo(level)));
      assertThat(ld.getSecondary().getUnlockLevel(), is(lessThanOrEqualTo(level)));
      for (Item item : ld.getTools())
        assertThat(item.getUnlockLevel(), is(lessThanOrEqualTo(level)));
      for (Item item : ld.getConsumables())
        assertThat(item.getUnlockLevel(), is(lessThanOrEqualTo(level)));
    }
  }
}
