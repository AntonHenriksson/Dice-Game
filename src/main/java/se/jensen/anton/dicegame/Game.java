package se.jensen.anton.dicegame;

import java.util.Scanner;

public class Game {
    private boolean running = true;
    Player player1 = new Player();
    Player player2 = new Player();
    Dice dice = new Dice();


    //tom konstruktor
    public Game() {

    }

    public boolean quitGame() {
        return running = false;
    }

    public void gameRun(Scanner input) {

        while (running) {
            System.out.println("Game Menu \nPlay\nQuit");

            String menuChoice = input.nextLine();
            if (menuChoice.equalsIgnoreCase("Play")) {

                System.out.println("Player 1 : ");
                player1.setPlayers(input);
                System.out.println("Player 2 : ");
                player2.setPlayers(input);
                tossingDice(input);
                winnerCompare();
                player1.resetScore();
                player2.resetScore();
                input.nextLine();


            } else if (!menuChoice.equalsIgnoreCase("Quit") && !menuChoice.equalsIgnoreCase("Play")) {
                System.out.println("Invalid Option");
            } else if (menuChoice.equalsIgnoreCase("Quit")) {
                quitGame();
            }


        }
    }


    public void tossingDice(Scanner input) {
        for (int i = 0; i < 2; i++) {
            System.out.println(player1.getFname() + " press enter to toss dice!");
            input.nextLine();
            player1.addToScore(dice.rollTheDice());
            System.out.println(player2.getFname() + " press enter to toss dice!");
            input.nextLine();
            player2.addToScore(dice.rollTheDice());

        }
    }

    public void winnerCompare() {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("Equal, no winner.");
        } else if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getFullName() + " wins with :" + player1.getScore());

        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getFullName() + " wins with :" + player2.getScore());
        }
    }


}
