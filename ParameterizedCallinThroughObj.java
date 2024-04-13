

import java.util.*;

public class ParameterizedCallinThroughObj {
    public int sum(int a, int b) {
        Scanner input = new Scanner(System.in);
       //a = input.nextInt();
        //b = input.nextInt();
        int z = a + b ;
        return z ;
    }

    public static void main(String[] args) {
        ParameterizedCallinThroughObj Aww = new ParameterizedCallinThroughObj();
        System.out.println(Aww.sum(5, 10)); 
          //       OR
        int C = Aww.sum(5, 10);
        System.out.println(C);
    }
}
