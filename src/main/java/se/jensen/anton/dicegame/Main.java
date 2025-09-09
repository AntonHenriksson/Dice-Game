package se.jensen.anton.dicegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Dice dice = new Dice();
        Game game = new Game();
        game.tossingDice(input, player1, player2, dice);

    }
}
