
/*
* Race Condition: 
* Simulate a race condition by creating two threads 
* that increment a shared counter variable. 
* How can you fix this race condition using synchronization? 
* (This will introduce you to the concept of race conditions and 
* how to prevent them using synchronization mechanisms.)
*/
// When two thread or process tries to access same resource at same time and causes
// problem in system

// So i am trying to take a input from user then two methods will keep changing the value
// and it will be saved in another variable and I am trying that the variable 
// wont get locked or it wont affect the threads

import java.util.*;

class A {
    protected int number;
    int changedNum = 0;

    public void setnumber(int n) {
        number = n;
    }

    public int getnumber() {
        return number;
    }

    synchronized public void initialAction() {
        for (int i = 0 ; i <= 100 ; i++ ){
            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is first thread (main number) : " + number);
            changedNum++ ;
            number++ ;
            notify();
        }
    }

    synchronized public void laterAction(){
        for(int i = 0 ; i <= 100 ; i++){
            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is second thread (changedNum) : " + changedNum * 100);
            notify();
        }
    }
}

public class MultiTQ3 extends Thread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();
        A obj = new A();
        obj.setnumber(x);
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                obj.initialAction();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                obj.laterAction();
            }
        });
        t1.start();
        t2.start();
    }

}
