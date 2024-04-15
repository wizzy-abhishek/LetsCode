class StaticA {
    static int a = 10;

    void m() // but if we decare this method static it cant be overrided .
    {
        a = a + 50;
        System.out.println(a);
    }
}

class B extends StaticA {
    @Override
    void m() // if both m uses static key word then the program will work but thats not overridding cause both of them are altogether different methods 
    {
        System.out.println("I am overriden from A and I am static");
    }
}

public class StaticExp {

    public static void main(String[] args) {
        // A obj = new B(); // This is called dynamic method dispatch 
        StaticA obj = new StaticA();
        B obj1 = new B();
        // A.a = 20;
        System.out.println(); // Static variables can be changed
        obj.m();
        obj1.m();
    }

}