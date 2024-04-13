
import java.util.*;
public class SimilarElementArray {
    /* public static void Execution(int[] Array){
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i <= Array.length ; i++){
            System.out.println("Your elements of Array : ");
            Array[i] = in.nextInt();
        }
        Arrays.sort(Array);
        for(int i = 0 ; i <= Array.length ; i++){
            System.out.println("Your Sorted Array is : ");
            System.out.println(Array[i] + " ");
        }
    } */

     public static void Execution(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int S = in.nextInt();
        int[] Array = new int[S] ;
        System.out.println("Your elements of Array : ");
        for(int i = 0 ; i < S ; i++){
            Array[i] = in.nextInt();
        }
        Arrays.sort(Array);
        System.out.println("Your Sorted Array is : ");
        for(int i = 0 ; i < S ; i++){
            System.out.println(Array[i] + " ");
        }
        System.out.println("Which number you want to know is repeated :");
        int R = in.nextInt();
        int Count = 0 ;
        for(int i = 0 ; i < S ; i++){
            if (Array[i] == R) {
                Count++;
            }
        }
        System.out.println("The number got repeated : " + Count);
    } 
    public static void main(String[] args) {
       
        Execution();
    }
}
