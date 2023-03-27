package ObjectOriented;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.animalSound();
        cat1.animalSound();
        dog1.sleep();
    }
}
