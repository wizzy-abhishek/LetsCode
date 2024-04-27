

import java.util.*;

class primeAdd {
    public static int primeNum(){
        int num = 2 ;
        for(int i = 2 ; i <= 5 ; i++){

        }
        return num;

    }





    public static int primeSum(int x, int y) {
        int Count = 0;
        for (int i = x; i <= y; i++) {
            if (x % i != 0) {
                Count += x;    
            }
        }
        return Count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(primeSum(x, y));
    }
}