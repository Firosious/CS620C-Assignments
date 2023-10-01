public class GeneralTester {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Tiger myTiger = new Tiger("omnivore", "purr");
        Horse myHorse = new Horse("herbivore", "neigh", 40);

        myDog.printDetails();
        
        myDog.setAnimalSound("woof");

        myDog.eatDogBiscuit();

        myDog.printDetails();

        System.out.println("Number of dog biscuits eaten: " + myDog.getBiscuitsEaten());
        myHorse.printDetails();

        myHorse.setSpeed(48);

        System.out.println("Horse speed: " + myHorse.getSpeed());

        myTiger.setAnimalDiet("carnivore");

        myTiger.printDetails();
    }
}
