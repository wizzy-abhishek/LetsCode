// class yz{
//     int a ;
//     int b ;
//     // public yz(int a, int b){
//     //     this.a = a;
//     //     this.b = b;
//     // }
//     public yz(){

//     }
//     public int getArea(){
//         return a*b ;
//     }
//     public String kbc(){
//         return "The winner is YOU";
//     }
// }


// public class Exp {

// public static void main(String[] args) {
//     //int xy = new yz(10, 20).getArea();
//     String k = new Rectangle().kbc();
//    // System.out.println(xy);
//     System.out.println(k);
// }

    
// }

class A{
    int num1 ; 
    static int num2 ;

    public void lmn(){
        num2++ ;
        num1++ ;
        System.out.println("a " + num1);
        System.out.println("b " + num2);
    }
    public void k(){
        num1 *= 10 ;
        num2 *= 100 ;
        System.out.println(num1 + " + " + num2);
    }
}
public class StaticVar{
    public static void main(String args[]){
        A obj = new A();
        A obj2 = new A();
        obj.num1 = 10 ;
        obj.num1 = 60 ;
        A.num2 = 20 ;
        obj.lmn();
        obj.lmn(); 
        obj.k();  
        
        obj2.k();    
    }
}

