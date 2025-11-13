import java.util.*;
public class NthFromEndLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        ListIterator<String> it1 = list.listIterator();
        ListIterator<String> it2 = list.listIterator();
        for (int i = 0; i < n && it2.hasNext(); i++) it2.next();
        while (it2.hasNext()) { it1.next(); it2.next(); }
        System.out.println(it1.next());
    }
}
