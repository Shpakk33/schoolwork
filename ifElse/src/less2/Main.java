package less2;
import java.util.Scanner;
public class Main{
     static Scanner tt = new Scanner(System.in);
 public static void main (String[]args) {
      System.out.println("введите два числа");
      int a = tt.nextInt();
      int b = tt.nextInt();
      Boolean isGreater = a>b;
      System.out.println(isGreater);
 }
}
