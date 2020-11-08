package zadacha1;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите число ");
        int a = num.nextInt();
        String w;
        switch (a){
            case 1: w = "понедельник ";
            break;
            case 2: w = "вторник ";
                break;
            case 3: w = "среда ";
                break;
            case 4: w = "четверг ";
                break;
            case 5: w = "пятница ";
                break;
            case 6: w = "суббота ";
                break;
            case 7: w = "воскресенье ";
                break;
            default:
                w = " дня под таким номером не существует";
        }
        System.out.println(w);
    }
}
