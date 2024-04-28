


//package Mypractice;
import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int z = input.nextInt();
        System.out.println("Enter the value of string : ");
        int arr[] = new int[z];
        for (int i = 0; i < z; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element you want to search :");
        int x = input.nextInt();
        for (int i = 0; i < z; i++) {
            if (x == arr[i]) {
                System.out.println("Element found at : " + ++i);
            } else {
                if (x != arr[i])
                    System.out.println("Element not found ");
            }
        }
    }
}