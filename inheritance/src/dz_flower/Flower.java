package dz_flower;
public class Flower {

    int petalCount = 0;
    String s = "initial value";
//делаем конструктор
    Flower(int petals) {
        petalCount = petals;
        //print("Constructor w/ int arg only, petalCount= " + petalCount);
    }
    Flower(String ss){
       /// print("Constructor w/ String arg only, s = " + ss);
        s = ss;

    }
    //вызываем this
    Flower(String s, int petals){
        this(petals);
        this.s = s;
       // print("String & int args");
    }
    //даем значение
    Flower(){
        this("hi", 47);
      //  print("default constructor (no args)");

    }
    //void printPetalCount() {
    //print("petalCount = " + petalCount + " s = "+ s);
    //}

    public static void main(String[] args) {
        Flower x = new Flower();
      //  x.printPetalCount();

    }
    }