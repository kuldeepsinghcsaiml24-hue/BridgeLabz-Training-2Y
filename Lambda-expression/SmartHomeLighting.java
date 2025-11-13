import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {
    public static void main(String[] args) {
        Map<String, Runnable> lightTriggers = new HashMap<>();

        lightTriggers.put("motion", () -> System.out.println("Lights ON - Motion detected!"));
        lightTriggers.put("evening", () -> System.out.println("Lights ON - Evening mode!"));
        lightTriggers.put("voice", () -> System.out.println("Lights ON - Voice command received!"));

        lightTriggers.get("motion").run();
        lightTriggers.get("evening").run();
        lightTriggers.get("voice").run();
    }
}
