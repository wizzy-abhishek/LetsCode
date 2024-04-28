

import java.util.Scanner;

public class Question62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 1;
        while (r <= num) {
            if (num % r == 0) {
                System.out.println(r + " ");
            }
            r++;
        }
    }
}