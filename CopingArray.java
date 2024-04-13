
import java.util.*;

public class CopingArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array A");
        int z = input.nextInt();
        int A[] = new int[z];
        System.out.println("Enter value of array A");
        for (int i = 0; i < z; i++) {
            A[i] = input.nextInt();
        }
        System.out.print("The element in array A are : ");
        for (int i = 0; i < z; i++) {
            System.out.print(A[i] + " ");
        }
        int B[] = new int[z]; //This array must be equal to or greater than the first array .
        System.out.println("\n This is second array in this all element are copied from array A");
        for (int i = 0; i < z; i++) {
            B[i] = A[i];
            System.out.print(B[i] + " ");
        }
        System.out.println("\nI am trying to copy an element from particular index : ");
        for(int i = 0;i<z; i++){
            B[i] = input.nextInt();
            B[0] = A[1];
        }
        for (int i = 0; i < z; i++) {
            System.out.print(B[i] + " ");
        }
    }
}