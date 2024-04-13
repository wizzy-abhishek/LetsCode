
import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int z;
        z = input.nextInt();
        int arr[] = new int[z];
        for (int i = 0; i < z; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
