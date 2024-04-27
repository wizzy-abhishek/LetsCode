

import java.util.*;
import java.lang.*;

public class pallendromwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        String a;
        String b = "";
        a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            b = ch + b;
        }
        System.out.println(b);
        if (a == b) {
            System.out.println("pallendrom of words");
        } else
            System.out.println("Not pallendrom of words");

    }
}