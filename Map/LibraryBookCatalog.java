
import java.util.*;
public class LibraryBookCatalog {
    public static void main(String[] args){
        Map<String,String> books=new TreeMap<>();
        books.put("978-1","Java");
        books.put("978-2","C++");
        System.out.println(books.getOrDefault("978-1","Not found"));
        books.remove("978-2");
        for(var e:books.entrySet()) System.out.println(e);
    }
}