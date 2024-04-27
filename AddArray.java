
import java.util.Scanner;

class AddArray {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int n;
        n = Input.nextInt();
        while (n > 0) {
            int z;
            z = Input.nextInt();
            int a[] = new int[z];
            for (int i = 0; i < z; i++) {
                a[i] = Input.nextInt();
            }
            int o;
            System.out.println("Enter the number of indice you wanna add : ");
            o = Input.nextInt();
            int b;
            System.out.println("Enter the number of indice you wanna add : ");
            b = Input.nextInt();
            int add;
            add = (a[o] + a[b]);
            System.out.println(add);
        }
        n--;
    }
}