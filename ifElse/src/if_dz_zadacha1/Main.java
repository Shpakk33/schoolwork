package if_dz_zadacha1;

import java.util.Scanner;

public class Main {
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите число а");
        int a = n.nextInt();
        System.out.println("введите число b ");
        int b = n.nextInt();
        System.out.println("введите число c");
        int c =n.nextInt();
        boolean t = (a == b) | (a == c) | (b == c);
        if (t) {
            System.out.println("треугольник равнобедренный");
        } else {
            System.out.println("треугольник неравнобредренный");
        }
    }
}
