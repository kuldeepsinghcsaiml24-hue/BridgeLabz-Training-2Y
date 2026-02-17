import java.util.*;
public class FeedbackProcessing {
    public static void main(String[] args){
        List<String> feedbacks = Arrays.asList("Good","Bad","Good");
        Set<String> unique = new HashSet<>(feedbacks);
        Queue<String> q = new LinkedList<>(unique);
        Stack<String> recent = new Stack<>();
        while(!q.isEmpty()) recent.push(q.poll());
        System.out.println(recent);
    }
}
