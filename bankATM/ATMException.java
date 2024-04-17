//Let Someone is in ATM and and the limit for daily withdraw is 10,000 only . Write
//a code for ATM machine
package bankATM ;

import java.util.InputMismatchException;
import java.util.Scanner;
class ATM extends RuntimeException{
    ATM(String message) {
        super("THERE MIGHT BE ANY ERROR !!! ");
    }
}

class ATMactions {
    private static int balance; // Initial balance

    public void setBalance(int initialBalance) {
        balance = initialBalance ;
    }

    public static int getBalance() {
        return balance;
    }

    public static void oldInfo() {

        System.out.println("Your balance is : " + getBalance());
    }

    public static void Deposit(int depositAmount) throws ATM {
        int afterDeposit = balance + depositAmount;
        if (depositAmount == 0) {
            System.out.println("No Money Added");
        } else
            System.out.println("Your new balance is : " + afterDeposit);
    }

    public static void Withdrawl(int withdrawAmt) throws ATM {
        if (withdrawAmt <= 0) {
            System.out.println("You are wasting resource and our time ");
        } else if (withdrawAmt > 10000) {
            System.out.println("You can only withdraw upto 10000 once ");
        } else if (balance < withdrawAmt) {
            System.out.println("You only have : " + getBalance() + " in your account");
        } else {
            int afterwithdraw = balance - withdrawAmt;
            System.out.printf("You withdrew : " + withdrawAmt);
            System.out.println("Your new balance is : " + afterwithdraw);

        }
    }
}

public class ATMException {
    public static void main(String[] args)
    {
    
        Scanner input = new Scanner(System.in);
        ATMactions obj = new ATMactions();
        System.out.println("THIS PROGRAM IS CASE SENSTIVE ");
        try {
            obj.setBalance(100000);
            ATMactions.oldInfo();
            System.out.println("Do you want to deposit : PRESS Y/N ");
            String Yes = "Y";
            String No = "N";
            String Option = input.nextLine();
            if (Option.equals(Yes)) {
                System.out.println("Enter the amount you want to enter : ");
                int money = input.nextInt();
                ATMactions.Deposit(money);
            } else if (Option.equals(No)) {
                System.out.println("Do you want to withdraw : PRESS Y/N ");
                String Option2 = input.nextLine();
                if (Option2.equals(Yes)) {
                    System.out.println("How much do you want to withdraw : ");
                    int moneygone = input.nextInt();
                    ATMactions.Withdrawl(moneygone);
                    System.out.println("THANK YOU FOR VISIT");
                } else {
                    System.out.println("NO MORE SERVICE AVAILABLE ");
                }
            }
        } catch (ATM e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException c){
            System.out.println("Entered a wrong input ");
        }
        finally {
            System.out.println("THANK YOU FOR USING OUR ATM");
            
        }
        input.close();
    }
}