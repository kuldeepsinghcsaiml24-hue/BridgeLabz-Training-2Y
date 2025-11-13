import java.util.*;
class Movie{ String name; Movie(String n){name=n;} public String toString(){return name;} }
public class StreamingWatchHistory {
    public static void main(String[] args){
        Stack<Movie> history = new Stack<>();
        List<Movie> all = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();
        upNext.add(new Movie("M1")); history.push(new Movie("M1"));
        System.out.println(history);
    }
}
