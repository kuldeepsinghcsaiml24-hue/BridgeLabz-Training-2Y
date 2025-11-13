public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SB101", "Anil", 50000),
            new CurrentAccount("CR202", "Maya", 100000)
        };
        for (BankAccount a : accounts) {
            if (a instanceof BankAccount) {
                a.displayDetails();
                System.out.println("Interest: " + a.calculateInterest());
                if (a instanceof Loanable) System.out.println("Loan Eligibility: " + ((Loanable) a).calculateLoanEligibility());
                System.out.println("---");
            }
        }
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public boolean withdraw(double amount) {
        if (amount <= balance) { balance -= amount; return true; } return false;
    }

    public abstract double calculateInterest();
    public void displayDetails() { System.out.println("Acc: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance); }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String holder, double bal) { super(acc, holder, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public boolean applyForLoan(double amount) { return amount <= getBalance() * 5; }
    public double calculateLoanEligibility() { return getBalance() * 5; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String holder, double bal) { super(acc, holder, bal); }
    public double calculateInterest() { return 0; }
}
