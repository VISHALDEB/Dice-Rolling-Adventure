import java.util.*;

public class Game {
    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;

    // Step 4: Constructor
    public Game(int targetScore) {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
        this.targetScore = targetScore;
    }

    // Step 5: Roll both dice
    public void rollDice() {
        dice1.roll();
        dice2.roll();

        int val1 = dice1.getValue();
        int val2 = dice2.getValue();

        System.out.println("Dice 1: " + val1);
        System.out.println("Dice 2: " + val2);

        // Add to score
        score += val1 + val2;

        // Step 6: Check doubles
        if (val1 == val2) {
            System.out.println("You rolled a double! Bonus points added.");
            score += 5; // bonus points
        }
    }

    // Step 7: Display score
    public void displayScore() {
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);
    }

    // Step 8: Check target reached
    public boolean isTargetReached() {
        return this.score >= this.targetScore;
    }
}