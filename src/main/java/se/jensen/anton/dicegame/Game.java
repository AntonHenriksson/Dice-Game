package se.jensen.anton.dicegame;

import java.util.Scanner;

public class Game {
    private boolean running = true;


    //tom konstruktor
    public Game() {

    }

    public boolean quit() {
        return running = false;
    }

    public void gameRun(Scanner input, Dice dice, Player player1, Player player2) {
        while (running) {
            System.out.println("Spelmeny \n1 : Spela\n2 : Stäng av");
            if (input.nextInt() == 1) {


            } else if (input.nextInt() == 2) {
                quit();

            }


        }
    }

    public void setPlayers(Scanner input, Player player1, Player player2) {
        System.out.println("Vad heter spelare 1 i förnamn?");
        player1.setFname(input.nextLine());
        System.out.println("Vad heter spelare 1 i efternamn?");
        player1.setLname(input.nextLine());
        System.out.println("Vad heter spelare 2 i förnamn?");
        player2.setFname(input.nextLine());
        System.out.println("Vad heter spelare 2 i efternamn?");
        player2.setLname(input.nextLine());

    }

    public void tossingDice(Scanner input, Player player1, Player player2, Dice dice) {
        System.out.println("Spelare 1: Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player1.addToScore(dice.rollTheDice());
        System.out.println("Spelare 2: Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player2.addToScore(dice.rollTheDice());
        System.out.println("Spelare 1: Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player1.addToScore(dice.rollTheDice());
        System.out.println("Spelare 2: Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player2.addToScore(dice.rollTheDice());
    }


}
