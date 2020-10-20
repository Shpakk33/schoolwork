package less3;

import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class Main {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите два числа");
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        int z = b * b - (4 * a * c);
        System.out.println(z);
        Boolean nn = z < 0;
        if (nn) {
            System.out.println("нет корней");
        } else {
            System.out.println("корни есть");
            double x1 = (-b - sqrt(z)) / (2 * a);
            double x2 = (-b + sqrt(z)) / (2 * a);

            System.out.println("x1" + x1);
            System.out.println("x2" + x2);

        }
    }
}
