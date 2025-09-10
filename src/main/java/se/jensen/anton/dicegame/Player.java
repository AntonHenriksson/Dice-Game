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
        System.out.println("First name of player: ");
        this.setFname(input.nextLine());
        System.out.println("Lastname of player: ");
        this.setLname(input.nextLine());


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
