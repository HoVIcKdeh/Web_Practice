import exceptions.OverloadedCharacteristicException;

public class Hero {

    int strength;
    int agility;
    int intelligence;

    public Hero(int strength, int agility, int intelligence) {

        if(!characteristicIsOK(strength, agility, intelligence))
            throw new OverloadedCharacteristicException();


        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    private boolean characteristicIsOK(int strength, int agility, int intelligence) {
        if (strength > 0 && strength <= 10 && agility > 0 && agility <= 10 && intelligence > 0 && intelligence <= 10)
            return true;
        else
            return false;
    }

}
