package zadacha8;

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 0;
        int i = 1;
        while (i <= 32) {
            System.out.println(" введите " +i+ " ую оценку");
            int num = ff.nextInt();
            if (num > max) max = num;
            i++;
        }
        System.out.println(" максимальная оценка "+max);
    }
    }





