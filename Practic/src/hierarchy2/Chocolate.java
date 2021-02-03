package hierarchy2;

public class Chocolate {
    String name;
    int price;

    public Chocolate(String name, int price){
        this.name = name;
        this.price = price;

    }
    public static Chocolate c (String name, int price){
        return new Chocolate(name, price);
    }
    //полиморфизм
    public String getName(){
        return this.name;
    } public int getPrice(){
        return this.price;
    }
}


