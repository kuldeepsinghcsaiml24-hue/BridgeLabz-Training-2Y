import java.util.function.Predicate;
public class TemperatureAlertSystem {
    public static void main(String[] args){
        Predicate<Double> threshold = t -> t > 40.0;
        double sample = 42.5;
        System.out.println(sample + " -> " + (threshold.test(sample) ? "ALERT" : "OK"));
    }
}
