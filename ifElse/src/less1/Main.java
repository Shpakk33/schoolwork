package less1;

import java.util.Scanner;

public class Main {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("введите два числа");
      int a = x.nextInt();
      int b = x.nextInt();
      System.out.println(a>b);
    }
}
