import java.util.*;
class Transaction { String type; Transaction(String t){type=t;} public String toString(){return type;} }
public class BankingTransactionSystem {
    public static void main(String[] args){
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Set<String> validAccounts = new HashSet<>(Arrays.asList("A1","A2"));
        Stack<Transaction> rollback = new Stack<>();
        pending.add(new Transaction("Deposit")); pending.add(new Transaction("Withdraw"));
        while(!pending.isEmpty()){
            Transaction t = pending.poll();
            all.add(t);
            if("Withdraw".equals(t.type)) rollback.push(t);
        }
        if(!rollback.isEmpty()) System.out.println("Rollback " + rollback.pop());
    }
}
