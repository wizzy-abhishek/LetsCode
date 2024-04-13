
import java.util.*;

class Employee{
    public String Name;
    private String ID ;
    private int Salary ;

    public Employee(String N , String I , int S){
        Name = N ; 
        ID = I ;
        Salary = S ;
    }
    public String getName(){
        return Name ;
    }
    public String getID(){
        return ID;
    }
    public int getSalary(){
        return Salary;
    }
}


public class ConstWGet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NAME : ");
        String X = input.nextLine();

        System.out.println("ENTER ID : ");
        String Y = input.nextLine();

        System.out.println("ENTER Salary : ");
        int Z = input.nextInt();

        Employee Eobj = new Employee(X, Y, Z);
        System.out.println(Eobj.getName());
        System.out.println(Eobj.getID());
        System.out.println(Eobj.getSalary());
    }
}
