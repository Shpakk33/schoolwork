package toStrings;

public class Main {
    public static void main(String[] args) {
        String s = new String("Anastasia");
        String s1 = new String("Anastasia");
        String s2 = new String("Artem");
        //System.out.println(s == s1);//true
        //System.out.println(s == s2);//false

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));//сравнение строковых велечин
        int a = 6;
        int b = 9;
        System.out.println(a==b);
    }
}
