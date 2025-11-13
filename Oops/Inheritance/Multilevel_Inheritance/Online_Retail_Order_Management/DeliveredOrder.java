class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){ super(orderId,orderDate,trackingNumber); this.deliveryDate=deliveryDate; }
    String getOrderStatus(){ return "Delivered on "+deliveryDate; }
}