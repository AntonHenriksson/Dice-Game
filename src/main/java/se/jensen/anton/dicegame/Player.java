package se.jensen.anton.dicegame;

import java.util.Scanner;

public class Player {
    private String fname;
    private String lname;
    private int score;


    //tom konstruktor
    public Player() {
    }

    public void setPlayers(Scanner input) {
        boolean valid = false;

        while (!valid) {

            System.out.println("First name of player: ");
            try {
                this.setFname(input.nextLine());
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Invalid input, try again");
            }
        }
        valid = false;

        while (!valid) {

            System.out.println("Last name of player: ");
            try {
                this.setLname(input.nextLine());
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Invalid input, try again");

            }
        }
    }

    // Kanske ändra här?
    public String getFullName() {
        return this.fname + " " + this.lname;

    }


    public void setFname(String fname) {
        if (fname == null) {
            throw new IllegalArgumentException("fname cant be null");
        } else if (fname.isBlank()) {
            throw new IllegalArgumentException("fname cant be empty");
        }
        this.fname = fname;
    }

    public void setLname(String lname) {
        if (lname == null) {
            throw new IllegalArgumentException("fname cant be null");
        } else if (lname.isBlank()) {
            throw new IllegalArgumentException("fname cant be empty");
        }
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    /// ingen användning
    public String getLname() {
        return lname;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int score) {
        this.score += score;
    }

    public void resetScore() {
        score = 0;
    }


}
