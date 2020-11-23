package dz_rectngle;

import rectangle.Vuvod;

public class Main {
    public static void main(String[] args) {
      Line a = new Line();
       a.a = 5;
       a.b = 6;
       a.h = 7;
       SqPer pp = new SqPer();
        int pp1 = pp.square(a.a, a.b, a.h );
        rectangle.Vuvod vv = new Vuvod();
        int pp2 = pp.perimeter(a.a, a.b, a.h);


    }
}
