import java.util.*;
class Book { String name; Book(String n){name=n;} public String toString(){return name;} }
public class LibrarySystemAdvanced {
    public static void main(String[] args){
        List<Book> allBooks = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();
        allBooks.add(new Book("B1")); members.add("M1"); issueQueue.add(new Book("B1"));
        System.out.println(allBooks);
    }
}
