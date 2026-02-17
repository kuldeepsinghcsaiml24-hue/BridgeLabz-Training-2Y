import java.util.*;
class TeamScore{ String team; int pts; TeamScore(String t,int p){team=t;pts=p;} public String toString(){return team+":"+pts;} }
public class TournamentScheduler {
    public static void main(String[] args){
        Set<String> teams = new HashSet<>(Arrays.asList("T1","T2"));
        Queue<String> fixtures = new LinkedList<>(Arrays.asList("F1","F2"));
        List<String> results = new ArrayList<>();
        TreeSet<TeamScore> leaderboard = new TreeSet<>((a,b)->b.pts - a.pts);
        leaderboard.add(new TeamScore("A",10)); leaderboard.add(new TeamScore("B",15));
        System.out.println(leaderboard);
    }
}
