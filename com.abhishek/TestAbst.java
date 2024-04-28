// abstract class Bike {
//     abstract void run();
// }

// public class Abstractclass extends Bike {
//     @Override
//     void run() {
//         System.out.println("Running ");
//     }

//     public static void main(String[] args) {
//         Bike obj = new Abstractclass(); // Dynamic method dispatch
//         obj.run();
//     }
// }

abstract class Shape{
    abstract void draw();
}
// in real cases implememtation is provided by other end i.e user
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }

    public String kbc() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kbc'");
    }
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
public class TestAbst{
    public static void main(String[] args) {
        // Shape s = new Circle1();            // Dynamic Dispatch method 
        // //Shape se = new Rectangle();
        // s.draw();
        // s = new Rectangle() ;
        // s.draw();
        Shape s = null ;
        s = new Circle1();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}