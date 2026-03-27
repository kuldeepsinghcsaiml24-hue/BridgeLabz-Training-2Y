public class SensitiveDataTagging {
    interface Sensitive {}
    static class User implements Sensitive { String secret="top"; }
    public static void main(String[] args){
        User u=new User();
        System.out.println((u instanceof Sensitive) ? "Sensitive - encrypt" : "Not sensitive");
    }
}
