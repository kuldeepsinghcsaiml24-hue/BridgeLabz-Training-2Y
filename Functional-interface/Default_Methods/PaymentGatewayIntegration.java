public class PaymentGatewayIntegration {
    interface PaymentProcessor { void process(double amount); default void refund(double amount){ System.out.println("Default refund: " + amount); } }
    static class ProviderA implements PaymentProcessor { public void process(double amount){ System.out.println("ProviderA paid: " + amount); } }
    static class ProviderB implements PaymentProcessor { public void process(double amount){ System.out.println("ProviderB paid: " + amount); } }
    public static void main(String[] args){
        PaymentProcessor p = new ProviderA();
        p.process(100);
        p.refund(20);
    }
}
