
import java.util.*;

public class WordPallendrom {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int word;
        word = Input.nextInt();
        char arr[] = new char[word];
        for (int i = 0; i < word; i++) {
            arr[i] = Input.next().charAt(i);
        }
        for (int n =0 ; n < word; n++) {
            System.out.println(arr[n]);
        }

    }

}
