package Rabota_cricle;

public class Cricle {
    //координаты центра
    double x;
    double y;
    //радиус
    double r;
    //площа
    double s;
    //длина
    double l;
    void printCricle(){
        System.out.println("(" + x + "; "+ y +") r = " + r);
    }
    void moveCricle(double a, double b){
        x = x + a;
        y = y + b;
    }
    void zoomCricle(double k){ r = r*k;}
    double squareCricle()
    {
       double s = 3.14 * r * r;
        return  s;

    }
    double lengthCricle()
    {
        double l = 2 * 3.14 * r;
        return l;
    }

}
