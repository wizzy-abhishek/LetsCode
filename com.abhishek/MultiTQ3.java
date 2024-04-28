
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




class MultiThreadA {
    int sharedNumber = 100 ;

    synchronized public void initialAction() {
        for (int i = 0 ; i <= 100 ; i++ ){
            
            int k = sharedNumber ;
            k++ ; 
            sharedNumber = k ; 
            System.out.println("This is first thread (main number) : " + sharedNumber);
            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }

    synchronized public void laterAction(){
        for(int i = 0 ; i <= 100 ; i++){
            int j = sharedNumber ;
            j-- ;
            sharedNumber = j ;
           System.out.println("This is second thread (changedNum) : " + sharedNumber);
           try {
            wait(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            notify();
        }
    }
}

public class MultiTQ3 extends Thread {
    
    public static void main(String[] args) {
        MultiThreadA obj = new MultiThreadA();
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
        // try {
        //     t1.sleep(2);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        t2.start();
        // try {
        //     t2.sleep(2);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }

}
