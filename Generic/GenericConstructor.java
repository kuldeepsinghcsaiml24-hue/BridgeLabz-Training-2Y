class GenConstructor {
    private double val;

    <T extends Number> GenConstructor(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("Value: " + val);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        GenConstructor gc = new GenConstructor(100);
        GenConstructor gc2 = new GenConstructor(123.5F);
        gc.showVal();
        gc2.showVal();
    }
}
