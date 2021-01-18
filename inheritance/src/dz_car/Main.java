package dz_car;


public class Main {
    public static void main(String[] args) {
        Car under = new Car();
        under.displayInfo();

        Car Opel = new Car("Opel", "universal");
        Opel.displayInfo();

        Car Audi = new Car("Audi", "sedan");
        Audi.displayInfo();




    }
}
