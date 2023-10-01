public class Horse extends Animal {
    private int speed;

    public Horse() {
        super();
        speed = 35;
    }

    public Horse(String diet, String sound, int speed) {
        super(diet, sound);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}