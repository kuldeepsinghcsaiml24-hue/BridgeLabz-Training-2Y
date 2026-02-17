import java.util.*;
class Team { String name; int points; Team(String n,int p){name=n;points=p;} public String toString(){return name+":"+points;} }
public class TournamentTracker {
    public static void main(String[] args){
        Set<String> players = new HashSet<>(Arrays.asList("P1","P2"));
        Queue<String> matches = new LinkedList<>(Arrays.asList("M1","M2"));
        List<String> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>((a,b)->b.points - a.points);
        leaderboard.add(new Team("A",10)); leaderboard.add(new Team("B",20));
        System.out.println(leaderboard);
    }
}
