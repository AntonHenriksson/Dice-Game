package se.jensen.anton.dicegame;

public class Player {
    private String fname;
    private String lname;
    private int score;

    Player player1 = new Player();
    Player player2 = new Player();

    //tom konstruktor
    public Player() {
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
