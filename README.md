# Hunt Randomizer

## Description

Are you tired of running the same loadout and need a way to spice up your life in the bayou?
Say no more.\
[Here's](https://puh00.github.io/hunt-randomizer/) hunt-randomizer at your service who will generously generate a random
loadout for you.

## Usage

The web app can be found at [`https://puh00.github.io/hunt-randomizer/`](https://puh00.github.io/hunt-randomizer/)

- **NOTE!** \
  The first request may take some time depending on if the api is on sleep mode. After the api has woken up it should be good to go for the following requests.

## Built With

- React as frontend and deployed to [GitHub Pages](https://pages.github.com/).
- Spring Boot with JDBC as backend. Api deployed on [Heroku](https://www.heroku.com/).

## Todo

- Display images
- Option to always include medkit and melee as tools

## Version History

- 0.1 (07/04/2021)
  - Initial Release
  - Generate a random loadout taking the following aspects into consideration:
    - a full loadout (using all available slots)
    - Quartermaster trait
    - Bloodline rank

## License

[MIT](LICENSE)
