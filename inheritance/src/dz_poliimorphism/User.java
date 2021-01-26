package dz_poliimorphism;

public class User {
    String adress;
    double weight;
    User(String adress) {
        this.adress = adress;
    }
        User(String adress, double weight){
        this.adress = adress;
        this.weight = weight;
    }
    public String toString(){
        return this.adress + " " + this.weight;
    }

}
