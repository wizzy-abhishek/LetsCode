
import java.util.Scanner;

public class Question61 {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int i = sc.nextInt();
              while (i>0){
                     int x = sc.nextInt();
                     int y = sc.nextInt();
                     int a = x / y;
                     int g = x % y;
                     System.out.println("The Quotient is = " + a);
                     System.out.println("The Remainder is = " + g);
              }
i--;
       }
}