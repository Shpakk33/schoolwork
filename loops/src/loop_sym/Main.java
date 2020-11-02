package loop_sym;

import java.util.Scanner;

public class Main  {
    static Scanner ff = new Scanner(System.in)
    public static void main(String[] args) {
        //сума 5 чисел
        int s=0,a;
        for (int i = 0; i <5 ; i++) {
            System.out.println("введите " + (i+1) + " число");
            a = ff.nextInt();
            s+=a;
        }
        System.out.println("сумма 5 чисел равна " + s);
        double n = s/5;
        System.out.println("среднее 5 чисел " + n);
    }
}
