public class Animal {
    private String animalDiet;
    private String animalSound;

    public Animal() {
        animalDiet = "undefined";
        animalSound = "undefined";
    }

    public Animal(String diet, String sound) {
        animalDiet = diet;
        animalSound = sound;
    }

    public String getAnimalDiet() {
        return animalDiet;
    }

    public void setAnimalDiet(String diet) {
        animalDiet = diet;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String sound) {
        animalSound = sound;
    }

    public void printDetails() {
        System.out.println("Diet: " + animalDiet);
        System.out.println("Animal Sound: " + animalSound);
    }
}