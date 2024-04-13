

import java.util.*;

class leet {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int z = Input.nextInt();
        int a[] = new int[z];
        int b[] = new int[z];
        int x = 0;
        int y = 0;
        for (int i = 0; i <= z; i++) {
            a[i] = Input.nextInt();

            a[i] = x;
        }

        for (int i = z; i < 0; i--) {
            b[i] = Input.nextInt();
            b[i] = y;
        }

        if (x == y) {
            System.err.println("True");
        } else
            System.err.println("False");
    }
}