package registrator;

public class Human {
    public static void register(Human h){
        System.out.println(h.name + " зареистрирован");
    }
    private String name;
    public Human(String name){
        this.name = name;
        register( this);
    }
    public static void main(String[] args) {
        new Human("John");

    }
}
