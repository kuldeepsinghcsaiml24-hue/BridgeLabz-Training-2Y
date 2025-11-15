
import java.util.*;
public class VotingCount {
    public static void main(String[] args){
        Map<String,Integer> votes=new HashMap<>();
        String[] cast={"A","B","A","C","B","A","C","A","B","A"};
        for(String c:cast) votes.put(c,votes.getOrDefault(c,0)+1);
        String winner=Collections.max(votes.entrySet(),Map.Entry.comparingByValue()).getKey();
        System.out.println(votes);
        System.out.println("Winner: "+winner);
    }
}