public class Dog extends Animal {
    private int numDogBiscuitsEaten;

    public Dog() {
        super();
        numDogBiscuitsEaten = 0;
    }

    public Dog(String diet, String sound) {
        super(diet, sound);
        numDogBiscuitsEaten = 0;
    }

    public int getBiscuitsEaten() {
        return numDogBiscuitsEaten;
    }

    public void eatDogBiscuit() {
        numDogBiscuitsEaten++;
    }
}
