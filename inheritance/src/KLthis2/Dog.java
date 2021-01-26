package KLthis2;

public class Dog {
    String brade;
    String name;
    int age;
    Dog(String name) { this.name = name;}
    Dog(String brade, String name, int age){

    this.brade = brade;
    this.name = name;
    this.age = age;
    }
    public String toString(){return this.brade + " "+ this.age; }
    public boolean equuals(Object o){
        boolean rezult = this.age == ((Dog)o).age &&
                this.brade.equals(((Dog) o).brade);
                this.name.equals(((Dog)o).name);
        return rezult;

    }
    }
