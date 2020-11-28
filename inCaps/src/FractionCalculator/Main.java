package FractionCalculator;

import java.util.Scanner;

public class Main {
    static Scanner cc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("введите числитель и знаменатель первой дроби");
        int x1 = cc.nextInt();
        int x2 = cc.nextInt();
        System.out.println("введите числитель и знаменатель второй дроби");
        int y1 = cc.nextInt();
        int y2 = cc.nextInt();
        Fraction f1 = new Fraction(x1, y1);
        Fraction f2 = new Fraction(x2, y2);
        Fraction summa = Calculator.add(f1, f2);
        System.out.println("сумма данных дробей равна");
        View.display(summa);
        Fraction product = Calculator.pro(f1, f2);
        System.out.println("произведение данных дробей равно");
        View.display(product);
        Fraction difference = Calculator.dif(f1, f2);
        System.out.println("деление данных дробей равно");
        View.display(difference);
    }
}
