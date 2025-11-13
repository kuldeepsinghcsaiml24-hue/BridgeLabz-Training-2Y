public class OrderMain {
    public static void main(String[] args){
        Order o = new Order("O100","2025-11-13");
        ShippedOrder s = new ShippedOrder("O101","2025-11-12","TRK123");
        DeliveredOrder d = new DeliveredOrder("O102","2025-11-10","TRK999","2025-11-13");
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}