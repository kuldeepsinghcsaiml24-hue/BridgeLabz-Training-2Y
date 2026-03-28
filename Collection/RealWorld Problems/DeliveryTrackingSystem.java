import java.util.*;
class PackageItem{ String id; PackageItem(String id){this.id=id;} public String toString(){return id;} }
public class DeliveryTrackingSystem {
    public static void main(String[] args){
        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();
        pending.add(new PackageItem("P1")); ids.add("P1");
        while(!pending.isEmpty()) delivered.add(pending.poll());
        System.out.println(delivered);
    }
}
