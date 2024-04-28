
import java.util.*;

public class TwoDArray {
    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(System.in);
            int A[][] = new int[3][3];
            System.out.println("Enter the elements for Array : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    A[i][j] = input.nextInt();
                }
            }
            System.out.println("THE ARRAY IS : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println(" ");
                input.close();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArrayStoreException g) {
            System.out.println(g.getMessage());
        } catch(Exception k){
            System.out.println("Enter integer type value ");
        }
    }
}
