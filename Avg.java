
public class Avg {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        System.out.println("The Given Input are : ");
        for (int n = 0; n < 5; n++)
            System.out.println(a[n]);
        float sum = 0;
        float avg;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        avg = sum / a.length;
        System.out.println("Avg = " + avg);
    }
}