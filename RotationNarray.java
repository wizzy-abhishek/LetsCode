import java.util.Scanner;

public class RotationNarray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter size of array : ");
            int s = input.nextInt();
            int[] Arr = new int[s];
            System.out.println("Enter the elememts of Array : ");
            for (int i = 0; i < s; i++) {
                Arr[i] = input.nextInt();
            }
            System.out.println("Enter How many elements you want to rotate : ");
            int r = input.nextInt();
            int element;
            for (int i = 0; i < r-1 ; i++) {
                element = Arr[s - 1]; // This isnt changing the value of last position neither pushing elements furthur //
                Arr[i] = element;
            }
            for (int i = 0; i < s; i++) {
                System.out.println(Arr[i]);
            }
            input.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArrayStoreException g) {
            System.out.println(g.getMessage());
        } catch (Exception e) {
            System.out
                    .println("There might be any error we will check after it , kindly look at the inputs you feeded");
        }

    }
}
