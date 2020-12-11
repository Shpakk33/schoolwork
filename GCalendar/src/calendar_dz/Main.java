package calendar_dz;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


    GregorianCalendar gc = new GregorianCalendar();
    int today = gc.get(Calendar.DAY_OF_MONTH);
    int month = gc.get(Calendar.MONTH);
gc.set((Calendar.DAY_OF_MONTH),1);
    int weekday = gc.get(Calendar.DAY_OF_WEEK);
System.out.println("   Mon   Tue   Wed   Thu   Fri   Sat   Sun");

for(int i = Calendar.SUNDAY+1; i < weekday; i++)
            System.out.print("      ");

do {
        int day = gc.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%5d", day);
        if (day == today) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        if (weekday == Calendar.SUNDAY)
            System.out.println();

        gc.add(Calendar.DAY_OF_MONTH, 1);
        weekday = gc.get(Calendar.DAY_OF_WEEK);
}
while (gc.get(Calendar.MONTH)==month);
}
}



