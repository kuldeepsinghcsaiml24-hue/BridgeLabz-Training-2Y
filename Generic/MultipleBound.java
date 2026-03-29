interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing Document");
    }
}

class Bounded<T extends Printable> {
    T obj;

    Bounded(T obj) {
        this.obj = obj;
    }

    void execute() {
        obj.print();
    }
}

public class MultipleBound {
    public static void main(String[] args) {
        Document d = new Document();
        Bounded<Document> b = new Bounded<>(d);
        b.execute();
    }
}
