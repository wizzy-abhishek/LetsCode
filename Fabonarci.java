


public class Fabonarci
{

    static int Program(int n) {
        return n * Program(n - 1);
    }

    public static void main(String[] args) {
        int z = Program(4);
        System.out.println(z);
    }
}
