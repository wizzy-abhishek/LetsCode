
import java.util.Scanner;
public class RemoveDuplicate {
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;
    
        int i = 1; 
        for (int j = 1; j < array.length; j++) {
          if (array[i - 1] != array[j]) {
            array[i] = array[j];
            i++;
          }
        }
        return i;
      }
      public static void main(String args[])
    {        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int index = removeDuplicates(array);
        for(i=0; i<index; i++){
            System.out.print(array[i] + " ");
        }
    }
}