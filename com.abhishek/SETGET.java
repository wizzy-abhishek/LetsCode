
import java.util.*;

class Student1 {
    String Student_name;
    private int marks;
    private String Roll;

    public void setmarks(int m) { // AS SETTER METHOD DOESNT RETURN ANY THING ITS OF VOID TYPE
        marks = m;
    }

    public int getmarks() {
        return marks; // AFTER SETTING ANY PRIVATE DATA MEMBER WE CAN RETURN THAT DATA MEMBER
    }

    public void setRoll(String R) {
        Roll = R;
    }

    public String getRoll() {
        return Roll;
    }
}

public class SETGET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student1 Hello = new Student1();
        System.out.println("Enter Student Roll : "); // When i set it here it worked but before it wasnt when it was atlast
        String Roll = input.nextLine();
        Hello.setRoll(Roll);
        System.out.println("Enter Student Name : ");
        String Student_name = input.nextLine();
        System.out.println("Enter Student marks : ");
        int marks = input.nextInt();
        Hello.setmarks(marks);
        System.out.println(Hello.getRoll());
        System.out.println(Student_name);
        System.out.println(Hello.getmarks());
        input.close();
    }
}