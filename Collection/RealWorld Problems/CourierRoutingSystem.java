import java.util.*;
class Parcel{ String id; Parcel(String id){this.id=id;} public String toString(){return id;} }
public class CourierRoutingSystem {
    public static void main(String[] args){
        PriorityQueue<Parcel> pq = new PriorityQueue<>(Comparator.comparing(p->p.id));
        Set<String> assigned = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normal = new LinkedList<>();
        normal.add(new Parcel("X1")); pq.add(new Parcel("P1")); assigned.add("P1");
        while(!normal.isEmpty()) completed.add(normal.poll());
        System.out.println(completed);
    }
}
