import java.util.*;
class Question { int id; Question(int id){this.id=id;} public String toString(){return "Q"+id;} }
public class OnlineExaminationSystem {
    public static void main(String[] args){
        List<Question> questions = Arrays.asList(new Question(1), new Question(2), new Question(3));
        Stack<Question> history = new Stack<>();
        for(Question q: questions) history.push(q);
        while(!history.isEmpty()) System.out.println(history.pop());
    }
}
