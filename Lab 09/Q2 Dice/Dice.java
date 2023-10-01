import java.util.Random;

public class Dice {
    private int numOfSides;
    private int faceValue;
    private Random rn;
    
    public Dice() {
        rn = new Random();
        numOfSides = 6;
        rollDice();
    }

    public Dice(int numOfSides) {
        rn = new Random();
        this.numOfSides = numOfSides;
        this.faceValue = rn.nextInt(numOfSides) + 1;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int rollDice() {
        this.faceValue = rn.nextInt(numOfSides) + 1;
        return faceValue;
    }
}