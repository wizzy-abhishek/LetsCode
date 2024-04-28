

import java.util.*;

class Game{
    int Computer ;
    int User ; 
    
    public Game(int Computer){
         this.Computer = Computer ;
    }

    public void takeUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        User = input.nextInt() ;
        input.close();
    }

    public void isNumberCorrect(int Computer  , int U){
        this.Computer = Computer ;
        User = U ;
        for(int i = 0 ; Computer == U ; i++){
            if(Computer == U){
                System.out.println("Yayyy You Got It...");
                break ;
            }
            else if (U > Computer){
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