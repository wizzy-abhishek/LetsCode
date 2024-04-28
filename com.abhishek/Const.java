
import java.util.Scanner;

class Student{
    private String Roll ;
    private int marks ;
    String Name ;
        
    public Student(String N , String R , int M){
        Roll = R ;
        marks = M;
        Name = N ;
    }

}
public class Const {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Roll : ");
        String Y = input.nextLine();

        System.out.println("Enter Student name : ");
        String Z = input.nextLine();

        System.out.println("Enter marks : ");
        int X = input.nextInt();
        
        Student AwwObj = new Student(Z ,Y, X);
       // System.out.println("Enter name : ");
       // AwwObj.Name = input.nextLine();
        System.out.println(AwwObj.Name);
        System.out.println(Y);
        System.out.println(X);
        input.close();
    }
}
