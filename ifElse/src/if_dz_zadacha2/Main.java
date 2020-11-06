package if_dz_zadacha2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        System.out.println("число а: ");
        int a = tt.nextInt();
        System.out.println("число b: ");
        int b = tt.nextInt();
        System.out.println("число с: ");
        int c = tt.nextInt();
        boolean a1 = (a + b > c)? true : false;
        boolean b1 = (a + c > b)? true : false;
        boolean c1 = (b + c > a)? true : false;

        System.out.println(a1 && b1 && c1? "треугольник существует " : "треугольник не существует " );
    }
    }

