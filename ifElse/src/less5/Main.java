package less5;

public class Main {
    public static void main(String[] args) {
        Boolean x = false;
        Boolean y = false;
        Boolean z = true;
        Boolean d1 = !x & !y;
        Boolean d2 = x & !y | z;
        Boolean d3 = x & !y & !z;
        System.out.println(d1 + " " + d2 + " " +d3);
    }
}
