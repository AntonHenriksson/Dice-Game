package se.jensen.anton.dicegame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private boolean running = true;


    //tom konstruktor
    public Game() {

    }

    public boolean quitGame() {
        return running = false;
    }

    public void gameRun(Scanner input) {
        while (running) {
            System.out.println("Spelmeny \n1 : Spela\n2 : Stäng av");
            int menuChoice = 0;
            try {
                menuChoice = input.nextInt();
            } throw  new InputMismatchException();
            if (menuChoice == 1) {


            } else if (menuChoice == 2) {
                quitGame();

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
        System.out.println(player1.getFname() + " : Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player1.addToScore(dice.rollTheDice());
        System.out.println(player2.getFname() + " : Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player2.addToScore(dice.rollTheDice());
        System.out.println(player1.getFname() + " : Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player1.addToScore(dice.rollTheDice());
        System.out.println(player2.getFname() + " : Tryck enter för att slå ett tärningslag!");
        input.nextLine();
        player2.addToScore(dice.rollTheDice());
    }

    public void winnerCompare(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("Equal, no winner.");
        } else if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getFullName() + "Wins with :" + player1.getScore());

        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getFullName() + "Wins with :" + player2.getScore());
        }
    }


}
