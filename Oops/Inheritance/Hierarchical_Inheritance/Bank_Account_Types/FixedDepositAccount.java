class FixedDepositAccount extends BankAccount {
    int tenureMonths;
    FixedDepositAccount(String accountNumber,double balance,int tenureMonths){super(accountNumber,balance);this.tenureMonths=tenureMonths;}
    void displayAccountType(){ System.out.println("FD Account: "+accountNumber+", Tenure:"+tenureMonths+" months"); }
}