public class Game {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice(12);

        System.out.println("Number of sides for d1: " + d1.getNumOfSides());


        System.out.println("Face value for d2: " + d2.getFaceValue());

        d1.setNumOfSides(20);

        System.out.println("Rolling d1: " + d1.rollDice());
        System.out.println("Rolling d2: " + d2.rollDice());
    }
}