package calendar;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       GregorianCalendar gc = new GregorianCalendar();

       int today = gc.get(Calendar.DAY_OF_MONTH);
       int month = gc.get(Calendar.MONTH);

       //первое число месяца
       gc.set((Calendar.DAY_OF_MONTH), 1);
       int weekday = gc.get(Calendar.DAY_OF_WEEK);

       //вывести заголовки
        System.out.println("   sun   mon   tue   wed   thu   fri   sat");

        //сдвиг на день недели
        for (int i = Calendar.SUNDAY; i <weekday ; i++) {
            System.out.println("      ");
        }
    }
}
