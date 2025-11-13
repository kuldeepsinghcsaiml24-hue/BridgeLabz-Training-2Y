class GenericSuper<T> {
    T obj;
    GenericSuper(T obj) {
        this.obj = obj;
    }
    void showType() {
        System.out.println("Type: " + obj.getClass().getName());
    }
}

class GenericSub<T> extends GenericSuper<T> {
    GenericSub(T obj) {
        super(obj);
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        GenericSub<Integer> genSub = new GenericSub<>(100);
        genSub.showType();
    }
}
