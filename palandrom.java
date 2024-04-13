

import java.util.*;

public class palandrom {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int z;
        int x = 0;
        int number = 0;
        int reminder;
        System.out.println("Enter your number :");
        z = Input.nextInt();
        while (z > 0) {

            x = number;
            reminder = z % 10;
            number = (number * 10) + reminder;
            z = z / 10;
            System.out.print(number);
        }
        if (z == x) {
            System.err.println("palandrom");
        } else
            System.err.print("not palandrom");
    }
}
// Global variable of number gives differenrt output
// diffenrt out put