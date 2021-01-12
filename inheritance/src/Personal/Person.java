package Personal;

public class Person {
    String name;
    int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    Person(){
        this(" Underfined", 18);

    }
    Person(String name){
        this(name, 29);
    }
    void displayInfo(){
        System.out.printf("name: %s \tAge: %d\n", name, age);
    }
}
