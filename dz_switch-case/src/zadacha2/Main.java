package zadacha2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("введите число ");
        int a = sc.nextInt();
        String w;
                switch (a) {
                    case 1:
                        w = "январь 31";
                        break;
                    case 2:
                        w = ("февраль 29 если год высокосный, 28 если невысокосный ");
                        break;
                    case 3:
                        w = "март 31";
                        break;
                    case 4:
                        w = "апрель 30";
                        break;
                    case 5:
                        w = "май 31";
                        break;
                    case 6:
                        w = "июнь 30";
                        break;
                    case 7:
                        w = "июль 31";
                        break;
                    case 8:
                        w = "август 31";
                        break;
                    case 9:
                        w = "сентябрь 30";
                        break;
                    case 10:
                        w = "октябрь 31";
                        break;
                    case 11:
                        w = "ноябрь 30";
                        break;
                    case 12:
                        w = "декабрь 31";
                        break;
                    default:
                        w = " такого месяца не существует";

                }
                System.out.println(w);
            }

        }