

import java.util.*;
public class Question65{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
       for(int i = n; i >= 1 ; i-- ){
        System.out.println("*");
        for (int z = 1; z <= n; z++){
           System.out.print("*");
        }
       }
    }
}