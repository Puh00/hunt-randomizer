import axios from "axios";

const LOADOUT_API_BASE_URL = "https://hunt-randomizer-api.herokuapp.com/v1/random";

class LoadoutService {
  getRandomLoadout(quarterMaster, fullLoadout, level) {
    return axios.get(LOADOUT_API_BASE_URL + '/' + quarterMaster + '/' + fullLoadout + '/' + level);
  }
}

export default new LoadoutService();