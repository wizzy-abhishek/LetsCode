
import java.util.Scanner;

class SquareThread extends Thread {
    private int begin;
    private int end;

    public SquareThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public void run() {
        // print the square of each number from begin to end
        // if begin is greater than end,
        // print the square of each number in reverse order from end to begin
        if (begin < end) {
            for (int i = begin; i <= end; i++) {
                System.out.println(i * i);
            }
            for (int i = end; i >= begin; i--) {
                System.out.println(i * i);
            }
        } else {
            for (int i = begin; i >= end; i--) {
                System.out.println(i * i);
            }
            for (int i = end; i <= begin; i++) {
                System.out.println(i * i);
            }
        }
    }
}

public class Square {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the begin for square calculation: ");
        int begin = scanner.nextInt();
        System.out.print("Enter the end for square calculation: ");
        int end = scanner.nextInt();
        scanner.close();

        SquareThread thread1 = new SquareThread(begin, end);
        SquareThread thread2 = new SquareThread(end, begin);

        thread1.start();
        thread2.start();
    }
}
