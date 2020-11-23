package dz_rectngle;

import rectangle.Vuvod;

public class Main {
    public static void main(String[] args) {
      Line a = new Line();
       a.a = 5;
       a.b = 6;
       SqPer pp = new SqPer();
        int pp1 = pp.square(a.a, a.b );
        int pp2 = pp.perimeter(a.a, a.b );
       Vuvod vv = new Vuvod();
       vv.printSq(pp1);
       vv.printPer(pp2);

    }
}
