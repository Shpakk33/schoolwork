package FractionCalculator;

public class Calculator {

    static Fraction add(Fraction f1, Fraction f2) {
        Fraction summa = new Fraction();
        summa.denominator = f1.denominator * f2.denominator;
        summa.numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        return summa;
    }

    static Fraction pro(Fraction f1, Fraction f2) {
        Fraction product = new Fraction();
        product.denominator = f1.denominator * f2.denominator;
        product.numerator = f1.numerator * f2.numerator;
        return product;
    }

    static Fraction dif(Fraction f1, Fraction f2) {
        Fraction difference = new Fraction();
        difference.denominator = f1.denominator * f2.denominator;
        difference.numerator = f1.numerator - f2.numerator ;
        return difference;
    }
    static Fraction fra(Fraction f1, Fraction f2) {
        Fraction fract = new Fraction();
        fract.denominator = f1.denominator * f2.numerator;
        fract.numerator = f1.denominator * f2.numerator;
        return fract;

    }
}