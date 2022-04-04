public class Battle {

    Player PlayerOne = new Player();
    Player PlayerTwo = new Player();

    // TODO: добавить обработку исключений с номерами + тесты (приоритет: 4)
    public void fight(int numFirst, int numSecond) {
        int ScoreOne = 0;
        int ScoreTwo = 0;

        if(PlayerOne.getHero(numFirst).getStrength() > PlayerTwo.getHero(numSecond).getStrength() ) {
            ++ScoreOne;
        }
        else if (PlayerOne.getHero(numFirst).getStrength() == PlayerTwo.getHero(numSecond).getStrength()) {
            ++ScoreOne;
            ++ScoreTwo;
        }
        else {
            ++ScoreTwo;
        }

        if(PlayerOne.getHero(numFirst).getAgility() > PlayerTwo.getHero(numSecond).getAgility() ) {
            ++ScoreOne;
        }
        else if (PlayerOne.getHero(numFirst).getAgility() == PlayerTwo.getHero(numSecond).getAgility()) {
            ++ScoreOne;
            ++ScoreTwo;
        }
        else {
            ++ScoreTwo;
        }

        if(PlayerOne.getHero(numFirst).getIntelligence() > PlayerTwo.getHero(numSecond).getIntelligence() ) {
            ++ScoreOne;
        }
        else if (PlayerOne.getHero(numFirst).getIntelligence() == PlayerTwo.getHero(numSecond).getIntelligence()) {
            ++ScoreOne;
            ++ScoreTwo;
        }
        else {
            ++ScoreTwo;
        }


        if(ScoreOne > 2 && ScoreOne > ScoreTwo) {
            PlayerTwo.setStatus(numSecond, false);
        }
        if(ScoreTwo > 2 && ScoreTwo > ScoreOne) {
            PlayerOne.setStatus(numFirst, false);
        }
    }
}
