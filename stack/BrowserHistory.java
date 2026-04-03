import java.util.Stack;
import java.util.Scanner;

class HistoryManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();

    public HistoryManager(String homepage) {
        backStack.push(homepage);
        System.out.println("Started at: " + homepage);
    }

    public void visit(String url) {
        forwardStack.clear();
        backStack.push(url);
        System.out.println("Visited: " + url);
    }

    public String back(int steps) {
        while (backStack.size() > 1 && steps > 0) {
            forwardStack.push(backStack.pop());
            steps--;
        }
        return backStack.peek();
    }

    public String forward(int steps) {
        while (!forwardStack.isEmpty() && steps > 0) {
            backStack.push(forwardStack.pop());
            steps--;
        }
        return backStack.peek();
    }
}

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter homepage URL: ");
        String home = scanner.nextLine();
        HistoryManager browser = new HistoryManager(home);

        while (true) {
            System.out.println("\nCommands: visit [url] | back [steps] | forward [steps] | exit");
            System.out.print("> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase();

            if (command.equals("exit")) break;

            switch (command) {
                case "visit":
                    if (parts.length > 1) browser.visit(parts[1]);
                    break;
                case "back":
                    if (parts.length > 1) {
                        int steps = Integer.parseInt(parts[1]);
                        System.out.println("Current Page: " + browser.back(steps));
                    }
                    break;
                case "forward":
                    if (parts.length > 1) {
                        int steps = Integer.parseInt(parts[1]);
                        System.out.println("Current Page: " + browser.forward(steps));
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        scanner.close();
        System.out.println("Browser closed.");
    }
}