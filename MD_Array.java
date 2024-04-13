

import java.util.Scanner;

public class MD_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] TwoD_matrix;
        TwoD_matrix = new int[5][5];
        try {System.out.println("Enter value of the array : ");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                   // for(int k = 0; k < 3 ; k++){
                    TwoD_matrix[i][j] = input.nextInt();
                   // }
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    //for(int k = 0; k < 3 ; k++){
                    System.out.print(TwoD_matrix[i][j]);
                    System.out.print(" ");
                    }
                    System.err.println(" ");
                //}
                //System.err.println(" ");
            }
            System.out.println("Enter the value of array you want to print");
            int X = input.nextInt();
            int Y = input.nextInt();
            System.out.println(TwoD_matrix[X][Y]);
            input.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length incorrect");
        } catch (Exception g) {
            System.out.println("Enter valid data type i.e, integer type");
        }

    }
}
