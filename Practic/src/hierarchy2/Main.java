package hierarchy2;

import hierarchy.Figure;

public class Main {
    public static void main(String[] args) {
        Snack s1 = new Snack("шоколад",);
        Stick s2 = new Stick("шоколадные палочки",);
        Chocolate с1 = new Chocolate("roshen", 21);
        Chocolate с2 = new Chocolate("корона", 30);
        Chocolate с3 = new Chocolate("світоч", 40);
        Chocolate с4 = new Chocolate("cвіточ", 40);
        if(c3 instanceof Snack) {
            c3 = c4;
        }else {
            System.out.println();
        }
        System.out.println(c2.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c3);


        System.out.println(s2 instanceof Chocolate);
        System.out.println(c1 instanceof Object);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(c2));

    }
}
