

import java.util.Scanner;

public class MD_Array_userL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of X , Y and Z axis : ");
        int X = input.nextInt(),Y = input.nextInt(),Z = input.nextInt();
        int[][][] Arr;
        Arr = new int[X][Y][Z];
        for(int i = 0 ; i < X ; i++){
            for(int j = 0 ; j < Y ; j++){
                for(int k = 0 ; k < Z ; k++){
                    System.out.print("Enter the value for place : " + i + " , " + j + " , " + k + " : ");
                    Arr[i][j][k] = input.nextInt();
                }
            }
        }
        for(int i = 0 ; i < X ; i++){
            for(int j = 0 ; j < Y ; j++){
                for(int k = 0 ; k < Z ; k++){
                    System.out.print(Arr[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        } 
    }
}