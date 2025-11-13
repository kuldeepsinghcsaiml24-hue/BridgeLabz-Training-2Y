public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Buddy",3), new Cat("Whiskers",2), new Bird("Tweety",1) };
        for(Animal a: animals) a.makeSound();
    }
}