package dz_oshibkaToString;

public class Dispatcher {
    public Dispatcher() {
    }

    public static void main(String[] args) {
        String s = new String("Oleh");
        String s1 = new String("Oleh");
        String s2 = new String("Iren");
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));

        Dog d = new Dog("Ladrador","Rex", 4);
        Dog d1 = new Dog("Ladrador","Rex", 4);
        Dog d2 = new Dog("Tax","Jessy", 1);

        System.out.println(d.equals(d1));
        System.out.println(d.equals(d2));

    }
}


