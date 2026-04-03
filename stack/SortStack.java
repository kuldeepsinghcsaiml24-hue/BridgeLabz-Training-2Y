import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int temp = s.pop();
        sortStack(s);
        insertSorted(s, temp);
    }

    private static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        sortStack(s);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}