class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
public class Box {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String value: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(25.7);
        System.out.println("Double value: " + dblBox.get());
    }
}
