class BoundedType<T extends Number> {
    private T num;

    public BoundedType(T num) {
        this.num = num;
    }

    public double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedType {
    public static void main(String[] args) {
        BoundedType<Integer> i = new BoundedType<>(5);
        System.out.println("Square: " + i.square());
    }
}
