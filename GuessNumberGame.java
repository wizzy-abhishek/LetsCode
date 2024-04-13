

import java.util.*;

class Game{
    int Computer ;
    int User ; 
    
    public Game(int Co){
         Computer = Co ;
    }

    public void takeUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        User = input.nextInt() ;
        input.close();
    }

    public void isNumberCorrect(int C , int U){
        Computer = C ;
        User = U ;
        for(int i = 0 ; C == U ; i++){
            if(C == U){
                System.out.println("Yayyy You Got It...");
                break ;
            }
            else if (U > C){
                System.out.println("Your number is greater");
            }
            else {
                System.out.println("Your number is smaller");
            }
        }
         
    }
}
 
public class GuessNumberGame{
    public static void main(String[] args) {
        Random RandomInput = new Random();
        int X = RandomInput.nextInt(0,100) ;
        Game obj = new Game(X);
        obj.takeUserInput();
        obj.isNumberCorrect(X, obj.User);
    }
}