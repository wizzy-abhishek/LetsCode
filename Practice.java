import java.util.Scanner;
public class Practice {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] array  = {1 , 2,3,4,5 };;
        //array = new int[5];
        System.out.println(array[0]);
        int[][] array1 = new int[3][3];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++)
                array1[i][j] = input.nextInt();
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++)
                System.out.println(array1[i][j]);
        }
    }
}
