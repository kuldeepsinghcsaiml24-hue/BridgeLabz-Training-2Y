class BankAccount {
    String accountNumber; double balance;
    BankAccount(String accountNumber,double balance){this.accountNumber=accountNumber;this.balance=balance;}
    void displayAccountType(){ System.out.println("Generic Account: "+accountNumber+", Balance:"+balance); }
}