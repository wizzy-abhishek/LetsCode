class SuperExp1 {
    public SuperExp1(int a){
        
        System.out.println("I am first constructor " + a);
    }

    public SuperExp1(int a , int b ){
        System.out.println("I am overloaded constructor of first " + a + " " + b);
    }
}

class SuperExp2 extends SuperExp1{
    public SuperExp2(int x){ // Can I create a constructor of child class for its own work 
        super(x);
        System.out.println("I am always a child constructor");
    }
    public SuperExp2(int x , int y){
        super(x, y);
    }
}



public class SuperExp {
    public static void main(String args[]){
        SuperExp1 idk = new SuperExp1(900);
        SuperExp2 exp = new SuperExp2(5);
        SuperExp2 exp2 = new SuperExp2(20, 40);
    }
}
