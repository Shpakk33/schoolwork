package string_m_dz;


import java.util.Scanner;

public class Main {
    static Scanner ss = new Scanner(System.in);


    public static void main(String[] args) {

        String str = "TODAY IS GOOD DAY";
        System.out.println(str);
        System.out.println ("Введите искомый символ ");
        String s = ss.nextLine();

        for (int i = 0; i < str.length(); i++) {
           int number = str.indexOf(s, i);
            if(number == -1) break;
            System.out.println(number + " ");
           i = number;

        }
        System.out.println();
        Integer d = 1;
        System.out.println(d);
        Integer[]c = {1};
        System.out.println(c);
    }
        }





