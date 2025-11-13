import java.util.*;
public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) { q1.add(x); }
    int pop() {
        while (q1.size() > 1) q2.add(q1.remove());
        int val = q1.remove();
        Queue<Integer> temp = q1; q1 = q2; q2 = temp;
        return val;
    }
    public static void main(String[] args) {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
    }
}
