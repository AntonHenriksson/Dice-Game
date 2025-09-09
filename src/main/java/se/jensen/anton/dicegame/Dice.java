package se.jensen.anton.dicegame;

import java.util.Random;

public class Dice {
    Random random = new Random();
    Dice dice = new Dice();

    //Tom konstruktor
    public Dice() {

    }

    public int rollTheDice() {
        int diceCast = random.nextInt(6) + 1;
        System.out.println("Tärningens kast: " + diceCast + "\n---------------------------");
        return diceCast;
    }

}
