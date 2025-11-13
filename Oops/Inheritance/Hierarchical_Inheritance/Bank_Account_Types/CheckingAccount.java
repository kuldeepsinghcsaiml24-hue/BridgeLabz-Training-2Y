class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,double withdrawalLimit){super(accountNumber,balance);this.withdrawalLimit=withdrawalLimit;}
    void displayAccountType(){ System.out.println("Checking Account: "+accountNumber+", Limit:"+withdrawalLimit); }
}