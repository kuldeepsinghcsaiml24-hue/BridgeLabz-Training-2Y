class BankAccount {
    String name;
    int acc;
    double bal;

    BankAccount(String name, int acc, double bal) {
        this.name = name;
        this.acc = acc;
        this.bal = bal;
    }

    void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt + ", Balance: " + bal);
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt + ", Balance: " + bal);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void show() {
        System.out.println("Account: " + acc + ", Holder: " + name + ", Balance: " + bal);
    }
}

public class BankAccountATM {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ravi", 12345, 5000);
        b.show();
        b.deposit(2000);
        b.withdraw(3000);
    }
}
