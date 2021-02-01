package hierarchy;

public class Main {
    public static void main(String[] args) {
        Figure a = new Figure (100, 55);
        Square s = new Square(50,60,5,"Rectangle");
        Rectangle n1 = new Rectangle(100,100);
        Rectangle n2 = new Rectangle(45, 40);
        System.out.println(s instanceof Figure);
        System.out.println(n1 instanceof Object);
        System.out.println(a.equals(s));
        System.out.println(a.equals(n2));
    }
    }

