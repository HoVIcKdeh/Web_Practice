import exceptions.OverloadedCharacteristicException;

public class Hero {

    private int strength;
    private int agility;
    private int intelligence;

    //TODO: тестировать (приоритет: 5)
    //TODO: помыть пол (чисто для меня XD)
    public Hero() {
        strength = (int) (Math.random()*10) + 1;
        agility = (int) (Math.random()*10) + 1;
        intelligence = (int) (Math.random()*10) + 1;
    }

    //TODO: тестировать (приоритет: 2)
    public Hero(int strength, int agility, int intelligence) {

        if(!characteristicIsOK(strength, agility, intelligence))
            throw new OverloadedCharacteristicException();


        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }
    //TODO: тестировать (приоритет: 3)
    private boolean characteristicIsOK(int strength, int agility, int intelligence) {
        if (strength > 0 && strength <= 10 && agility > 0 && agility <= 10 && intelligence > 0 && intelligence <= 10)
            return true;
        else
            return false;
    }

    //TODO: тестировать (приоритет: 1)
    public int getStrength() {
        return strength;
    }

    //TODO: тестировать (приоритет: 1)
    public int getAgility() {
        return agility;
    }

    //TODO: тестировать (приоритет: 1)
    public int getIntelligence() {
        return intelligence;
    }
}
