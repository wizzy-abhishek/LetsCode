class inheritanceA{
    int A ;
    String B ;
    
    public void Name_Age(int c){
        int g = A + c ;
        System.out.println("My name is " + B + " my age is " + g);
    }
}

class inheritanceB extends inheritanceA{
    String C ; 

    public void WhichClass(int j ){
        super.Name_Age(10);
        System.out.println("I am in " + C );
    }
}

public class inheritance extends inheritanceB {
        public static void main(String[] args) {
            inheritanceB obj = new inheritanceB();
            obj.C = "10";
            obj.Name_Age(15);
            obj.A = 10 ;
            obj.B = "Abhishek" ;
            obj.Name_Age(20);
            obj.WhichClass(18);
    }
}
