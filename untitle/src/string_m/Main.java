package string_m;

public class Main {
    public static void main(String[] args) {
        String a = "JAVA FOREVER";
        int index1 = a.indexOf('A');
        System.out.println(index1);
        int index2 = a.indexOf('A', 2);
        System.out.println(index2);
        int index3 = a.indexOf("FOR");
        System.out.println(index3);
        int aa = 40, bb = 34;
        double cc = 56.5, dd = 7.2;
        change(aa, bb);
        change(cc, dd);
        change(aa, bb);
        change(aa, bb);
        change(aa, cc);
        change(dd, bb);
    }

    static void change(int x, int y) {
        System.out.println(x + y);

    }

    static void change(double x, double y) {
        System.out.println(x - y);
        }

        static void change ( double x, int y) {
            System.out.println(x - y);
        }
        static void change ( int x, double y) {
            System.out.println(x - y);
        }
    }
