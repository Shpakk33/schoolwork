package zadacha6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for ( int i = 1;  i <= 10; i++){
            System.out.println(" "+ i +"  ibs = "+ Math.round(0.453 * i * 100)/100 + "kg" );
        }

    }

}