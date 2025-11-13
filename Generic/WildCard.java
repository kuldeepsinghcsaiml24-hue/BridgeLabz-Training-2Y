import java.util.*;

public class WildCard {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");
        printList(intList);
        printList(strList);
    }
}
