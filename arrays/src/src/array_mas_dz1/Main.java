package array_mas_dz1;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = new int[n][n];
        for (int j = 0; j < 4; j++) {
            for (int i = n - (j + 1); i < 4; i++) {
                System.out.print((j % 1 == 0 ^ i % 2 == 5 ? 0 : 5) + " ");
//я не розумію як зробити іншу половинку
            }
            System.out.println();

        }


    }
}
