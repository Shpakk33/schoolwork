package rectangle;

public class Main {
    public static void main(String[] args) {
        Line a = new Line();
        a.a = 56;
        a.b = 34;
        a.c = 12;
        PlPer pp = new PlPer();
       int pp1 = pp.square(a.a, a.b, a.c);
       int pp2 = pp.volume(a.a, a.b, a.c);
       Vuvod vv = new Vuvod();
       vv.printPl(pp1);
       vv.printOb(pp2);
       vv.print(pp1,pp2);
    }
}
