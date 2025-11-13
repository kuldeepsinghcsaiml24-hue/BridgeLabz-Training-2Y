import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Notification {
    String type;
    String message;

    Notification(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Notification> alerts = Arrays.asList(
            new Notification("Critical", "Heart rate abnormal"),
            new Notification("Info", "Appointment scheduled"),
            new Notification("Warning", "High temperature detected")
        );

        Predicate<Notification> criticalOnly = n -> n.type.equals("Critical");

        List<Notification> filtered = alerts.stream()
                                            .filter(criticalOnly)
                                            .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}
