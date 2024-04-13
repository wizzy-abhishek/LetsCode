
import java.util.Scanner;

class ArrayInput {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int number[] = new int[5];
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < 5; i++) {
            number[i] = Input.nextInt();
        }
        System.out.println("The Given Input are : ");
        for (int n = 0; n < 5; n++) /* {if(number[n]<10){ */
            System.out.println(number[n]);
        /*
         * else{
         * System.out.println("NO"); I WAS TRYYING SOMETHING
         * }
         */
    }
}