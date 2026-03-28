import java.util.*;
class RideRequest { int id; int priority; RideRequest(int id,int p){this.id=id;this.priority=p;} public String toString(){return "Ride:"+id;} }
class Driver { int id; Driver(int id){this.id=id;} public String toString(){return "Driver:"+id;} }
public class RideSharingDispatchSystem {
    public static void main(String[] args){
        Queue<RideRequest> pending = new LinkedList<>();
        Set<Driver> drivers = new HashSet<>();
        List<String> completed = new ArrayList<>();
        pending.add(new RideRequest(1,2)); pending.add(new RideRequest(2,1));
        drivers.add(new Driver(1)); drivers.add(new Driver(2));
        while(!pending.isEmpty()) completed.add(pending.poll().toString());
        System.out.println(completed);
    }
}
