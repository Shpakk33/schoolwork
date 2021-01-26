package dz_poliimorphism;

public class Main {
    public static void main(String[] args) {
       String User = new String("Artem");
        String User1 = new String("Artem");
        String User2 = new String("Olga");
        System.out.println(User == User1);
       System.out.println(User == User2);

        User Artem = new User("Порика 47", "45.5");
        System.out.println(User.equals(User1));
        System.out.println(User.equals(User2));

        User Andrei = new User("Свободи 29", "78.3");

    }

}
