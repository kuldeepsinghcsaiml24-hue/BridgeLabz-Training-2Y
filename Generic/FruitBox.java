import java.util.*;

class Fruit {
    public String toString() {
        return "Generic Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Mango extends Fruit {
    public String toString() {
        return "Mango";
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void showFruits() {
        for (T fruit : fruits)
            System.out.println(fruit);
    }
}

public class FruitBox {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.addFruit(new Mango());
        box.showFruits();
    }
}
