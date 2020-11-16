package array_mas_dz7;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++){
                System.out.print(( j % 2 == 0 ^ i % 2 == 0? 0 : 1) + " ");

            }
        System.out.println();
        }
        }

    }

