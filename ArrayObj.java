class Info{
    String name ;
    int mobileNum ;
}

public class ArrayObj {
    public static void main(String[] args) {
        Info p1 = new Info();
        p1.name = "Abhishek" ;
        p1.mobileNum = 82357726 ;

        Info p2 = new Info();
        p2.name = "Gargi" ;
        p2.mobileNum = 80859914 ;

        Info p3 = new Info();
        p3.name = "Aman" ;
        p3.mobileNum = 80927720 ;
        
        Info info[] = new Info[3];
        info[0] = p1 ;
        info[1] = p2 ;
        info[2] = p3 ;

        for(Info z : info){
            System.out.println(z.name + " : " + z.mobileNum);
        }

    }
}
