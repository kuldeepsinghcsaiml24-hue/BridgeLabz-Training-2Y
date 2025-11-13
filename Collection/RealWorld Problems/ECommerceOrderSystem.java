import java.util.*;
class Order { int id; Order(int id){ this.id=id; } public String toString(){ return "Order:"+id; } public boolean equals(Object o){ if(!(o instanceof Order)) return false; return id==((Order)o).id;} public int hashCode(){ return Objects.hash(id);} }
public class ECommerceOrderSystem {
    public static void main(String[] args){
        List<Order> orders = new ArrayList<>(Arrays.asList(new Order(1), new Order(2), new Order(1)));
        Set<Order> unique = new LinkedHashSet<>(orders);
        Queue<Order> queue = new LinkedList<>(unique);
        Stack<Order> failed = new Stack<>();
        while(!queue.isEmpty()){ Order o=queue.poll(); if(o.id==2) failed.push(o); }
        while(!failed.isEmpty()) System.out.println("Retry " + failed.pop());
    }
}
