package loop_tr;

public class Main {
    public static void main(String[] args) {
        //первый треугольник от 10 до 1
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //второй треугольник от 1 до 10
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //третий треугольник
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //треугольник из задания номер 1
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //треугольник из задания номер 2
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //треугольник из задания номер 4
        for (int i = 0; i <10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 10; i <0; i--) {
            for (int j = i; j < 10; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        }



    }

