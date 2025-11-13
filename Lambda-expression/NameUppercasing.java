import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upper = employees.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());
        upper.forEach(System.out::println);
    }
}
