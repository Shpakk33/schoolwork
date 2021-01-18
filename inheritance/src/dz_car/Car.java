package dz_car;

public class Car {
    String Firm;
    String Kuzov;


    public Car(String Firm, String Kuzov){
        this.Firm = Firm;
        this.Kuzov = Kuzov;

    }
    Car(){
        this(" BMW", "hatchback");

    }
    Car(String Firm){ this(Firm, "hatchback"); }

    void displayInfo(){
        System.out.printf("Firm: %s \tKuzov: %d\n", Firm, Kuzov);///тут у мене помилка біля kuzov
    }


}
