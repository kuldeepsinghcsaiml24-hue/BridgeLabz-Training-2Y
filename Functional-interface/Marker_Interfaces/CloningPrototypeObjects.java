public class CloningPrototypeObjects {
    static class Prototype implements Cloneable {
        int id=101;
        public Prototype clone() throws CloneNotSupportedException { return (Prototype) super.clone(); }
    }
    public static void main(String[] args) throws Exception {
        Prototype p1 = new Prototype();
        Prototype p2 = p1.clone();
        System.out.println(p2.id);
    }
}
