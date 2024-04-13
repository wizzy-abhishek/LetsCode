


/* Print Numbers: 
Write a program that creates two threads. 
One thread should print odd numbers from 1 to 10, 
and the other thread should print even numbers from 2 to 10. 
(This is a good exercise to understand how to create threads and get them to run concurrently.)
 */

 class PrintNumber extends Thread {
    int start;
    int end;

    public PrintNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void evenNumber() {
        synchronized (this) {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    try {
                        wait(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("The even numbers is: " + i);
                    
                    notify();
                }
            }
        }
    }

    public void oddumber() {
        synchronized (this) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    try {
                        wait(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("The odd numbers is : " + i);
                    
                    notify();
                }
            }
        }
    }

    /*
     * public void run() {
     * for (int i = start; i <= end; i++) {
     * if (i % 2 == 0) {
     * System.out.println("The number is A : " + i);
     * }
     * 
     * else {
     * System.out.println("The number is B : " + i);
     * }
     * 
     * }
     */
    /*
     * for (int i = start; i <= end; i++) {
     * if (i % 2 == 0 && this.getName().equals("EvenThread")) { // Check for even
     * and thread name
     * System.out.println("The number is: " + i);
     * } else if (i % 2 != 0 && this.getName().equals("OddThread")) { // Check for
     * odd and thread name
     * System.out.println("The number is: " + i);
     * }
     * }
     */
}

public class MultiTQ2 {
    public static void main(String[] args) {
        // PrintNumber t1 = new PrintNumber(1, 10);
        // t1.setName("ODD ");
        // PrintNumber t2 = new PrintNumber(1, 10);
        // t2.setName("EVEN");
        PrintNumber obj = new PrintNumber(1, 10);
        Thread t1 = new Thread(new Runnable() // I implemented interface which have anstract which i overrided or changed.
        {
            public void run() {
                obj.evenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() 
        {
            public void run() {
                obj.oddumber();
            }
        });
        t2.start();
        t1.start();
        
    }
}