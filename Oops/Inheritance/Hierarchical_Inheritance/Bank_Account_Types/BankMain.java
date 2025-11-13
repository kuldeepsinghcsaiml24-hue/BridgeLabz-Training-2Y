public class BankMain {
    public static void main(String[] args){
        BankAccount[] accounts = { new SavingsAccount("S001",5000,3.5), new CheckingAccount("C001",2000,1000), new FixedDepositAccount("F001",10000,12) };
        for(BankAccount a: accounts) a.displayAccountType();
    }
}