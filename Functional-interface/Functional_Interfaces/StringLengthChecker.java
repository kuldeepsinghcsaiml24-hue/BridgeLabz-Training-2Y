import java.util.function.Function;
public class StringLengthChecker {
    public static void main(String[] args){
        Function<String, Integer> len = s -> s.length();
        String sample = "Hello Functional Interface";
        System.out.println("Length: " + len.apply(sample));
    }
}
