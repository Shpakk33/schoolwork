package zadacha16;

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i <32; i++){
            System.out.println("введите рост ученика");
            int a = ff.nextInt();
            int b = 180;
            if (a>=b) {
                System.out.println("подходит");
            } else {
                System.out.println("не подходит");
            }
        }
    }
}
