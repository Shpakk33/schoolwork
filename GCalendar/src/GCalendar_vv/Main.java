package GCalendar_vv;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        //System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        //System.out.println(gc.get(Calendar.MONTH));
        //System.out.println(gc.get(Calendar.YEAR));
        //System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        gc.set(Calendar.MONTH, 11);
        gc.set(Calendar.YEAR,2010);
        gc.set(Calendar.DAY_OF_MONTH, 7);
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        gc.set(Calendar.MONTH, 2);
        gc.set(Calendar.YEAR,2004);
        gc.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        GregorianCalendar gc1 = new GregorianCalendar(2025,Calendar.JANUARY,1);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar gc2 = new GregorianCalendar(2020, Calendar.DECEMBER,29);
        gc2.add(Calendar.DAY_OF_MONTH,5);
        System.out.println(gc2.get(Calendar.YEAR));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.DAY_OF_MONTH));
    }
}
