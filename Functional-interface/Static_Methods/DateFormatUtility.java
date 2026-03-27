import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatUtility {
    interface DateUtils { static String format(LocalDate d, String pattern){ return d.format(DateTimeFormatter.ofPattern(pattern)); } }
    public static void main(String[] args){
        System.out.println(DateUtils.format(LocalDate.of(2025,11,13),"dd-MM-yyyy"));
        System.out.println(DateUtils.format(LocalDate.of(2025,11,13),"yyyy/MM/dd"));
    }
}
