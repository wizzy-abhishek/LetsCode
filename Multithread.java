

import java.util.*;

class Myt extends Thread {
    public void run() {
        Scanner Input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter the value of x :");
        x = Input.nextInt();
        System.out.println("Enter the value of y :");
        y = Input.nextInt();
        int z = x / y;
        System.out.println(z);
    }
}

class Mytt extends Thread {
    public void run() {
        Scanner Input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the value of a :");
        a = Input.nextInt();
        System.out.println("Enter the value of b :");
        b = Input.nextInt();
        float c = a % b;
        System.out.println(c);
    }
}

public class Multithread {
    public static void main(String[] args) {
        Myt u = new Myt();
        u.start();
        Mytt G = new Mytt();
        G.start();
    }
}