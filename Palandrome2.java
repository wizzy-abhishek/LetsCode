

public class Palandrome2 {
    public int Palandrome(int x){
        int y = 0;
        while(x > 0){
            y = (x % 10) + 10 * y;
            x = x/10;
        }
        return y ;
    }
    public static void main(String[] args) {
        Palandrome2 obj = new Palandrome2();
        System.out.println(obj.Palandrome(131));
    }
}
