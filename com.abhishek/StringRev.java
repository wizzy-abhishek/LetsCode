
import java.util.*;

public class StringRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        String a;
        String b = "";
        a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            //System.out.println(ch);
            b = ch + b;
            //System.out.println(b);
        }
        System.out.println(b);
        input.close();
        if (a.equals(b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}