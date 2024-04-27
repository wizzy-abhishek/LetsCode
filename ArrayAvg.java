
import java.util.Scanner;
import java.util.Date;

public class ArrayAvg {
    public static void main(String args[]) {
        Date today = new Date();
        System.out.println(today);
        Scanner Input = new Scanner(System.in);
        int z;
        System.out.println("Enter the amt of number you want an avg of : ");
        z = Input.nextInt();
        int a[] = new int[z];
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < z; i++) {
            a[i] = Input.nextInt();
        }
        System.out.println("The Given Input are : ");
        for (int n = 0; n < z; n++)
            System.out.println(a[n]);
        System.out.println("The length of array is " + a.length);
        float sum = 0;
        float avg;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        avg = sum / a.length;
        System.out.println("Avg = " + avg);
    }
}