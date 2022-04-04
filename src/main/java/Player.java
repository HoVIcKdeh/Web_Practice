public class Player {

    private Hero[] Team = new Hero[5];
    boolean[] HeroStatus = new boolean[5];

    public Player() {
        for(int i = 0; i < 5; i++) {
            HeroStatus[i] = true;
        }
    }

    // TODO: добавить обработку исключений с номерами (приоритет: 2)
    //TODO: тестировать (приоритет: 1)
    public Hero getHero(int num) {
        return Team[num];
    }

    // TODO: добавить обработку исключений с номерами (приоритет: 2)
    //TODO: тестировать (приоритет: 1)
    public boolean getStatus(int num) {
        return  HeroStatus[num];
    }

    // TODO: добавить обработку исключений с номерами (приоритет: 2)
    //TODO: тестировать (приоритет: 1)
    public void setStatus(int num, boolean status) {
        HeroStatus[num] = status;
    }
}
