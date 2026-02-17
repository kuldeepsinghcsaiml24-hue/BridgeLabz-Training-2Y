import java.util.*;
class Booking{ String user; Booking(String u){user=u;} public String toString(){return user;} }
public class EventTicketSystem {
    public static void main(String[] args){
        List<Booking> bookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> vip = new PriorityQueue<>(Comparator.comparing(b->b.user));
        bookings.add(new Booking("U1")); users.add("U1"); queue.add(new Booking("U1"));
        System.out.println(users);
    }
}
