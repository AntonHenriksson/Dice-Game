package se.jensen.anton.dicegame;

public class Player {
    private String fname;
    private String lname;
    private int score;

    //tom konstruktor
    public Player() {
    }

    // Kanske ändra här?
    public String getFullName(Player player) {
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
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int score) {
        this.score += score;
    }

    public void resetScore() {
        this.score = 0;
    }

    public void winnerCompare(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("Equal, no winner.");
        } else if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getFullName());

        }
    }


}
