package Rabota_cricle;

public class Main {
    public static void main(String[] args) {
        Cricle c1 = new Cricle();
        c1.printCricle();
        c1.x = 3;
        c1.y = 6;
        c1.printCricle();
        c1.r = 13.4;
        c1.zoomCricle(4.6);
        c1.printCricle();
        c1.lengthCricle();
        System.out.println(c1.squareCricle());
        System.out.println( c1.lengthCricle());

    }
}
