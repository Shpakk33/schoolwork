package Personal;

public class Main {
    public static void main(String[] args) {
        Person under = new Person();
        under.displayInfo();

        Person Tom = new Person("Tom");
        Tom.displayInfo();

        Person mari = new Person("mari", 21);
        mari.displayInfo();
    }
}
