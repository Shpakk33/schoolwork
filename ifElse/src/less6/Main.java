package less6;

import java.util.Scanner;

public class Main {
    static Scanner tt =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("введите два числа");
        int a = tt.nextInt();
        int b = tt.nextInt();

        Boolean d = (a>=0) | (b*b != 0);
        Boolean d1 = (a*b != 0) | (a<b);
        Boolean d2 = (! (a*b<0))&(a>b);
        if (d){
            System.out.println("точки подходят");
        } else {
            System.out.println("точки не подходят"); }
        if (d1){
            System.out.println("точки подходят");
        } else {
            System.out.println("точки не подходят");
        } if (d2){
            System.out.println("точки подходят");
        } else {
            System.out.println("точки не подходят"); }
    }

}
