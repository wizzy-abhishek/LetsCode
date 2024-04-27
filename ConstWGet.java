
import java.util.*;

class Employee{
    public String Name;
    private String ID ;
    private int Salary ;

    public Employee(String Name , String ID , int Salary){
        this.Name = Name ; 
        this.ID = ID ;
        this.Salary = Salary ;
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
        System.out.print("ENTER NAME : ");
        String X = input.nextLine();

        System.out.print("ENTER ID : ");
        String Y = input.nextLine();

        System.out.print("ENTER Salary : ");
        int Z = input.nextInt();
        System.out.println();
        Employee Eobj = new Employee(X, Y, Z);
        System.out.println(Eobj.getID() + " : " + Eobj.getName());
        System.out.println(Eobj.getSalary());
        input.close();
    }
}
