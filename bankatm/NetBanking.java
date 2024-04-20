//Let Someone is in ATM and and the limit for daily withdraw is 10,000 only . Write
//a code for ATM machine
// I am gonna learn jdbc and net connectivity and make this a online portal for money transaction 
// then via swing and awt i am gonna give this a face .

package bankatm ;

import java.util.InputMismatchException;
import java.util.Scanner;



class NetBankingE extends RuntimeException{
    NetBankingE(String message) {
        super("THERE MIGHT BE ANY ERROR !!! ");
    }
}


class AccountInfo{
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
}



class DepositAmt {

    public static void Deposit(int depositAmount) throws NetBankingE {
        int afterDeposit = AccountInfo.getBalance() + depositAmount;
        if (depositAmount == 0) {
            System.out.println("No Money Added");
        } else
            System.out.println("Your new balance is : " + afterDeposit);
    }
}


class WithdrawlAction{
    public static void Withdrawl(int withdrawAmt) throws NetBankingE {
        if (withdrawAmt <= 0) {
            System.out.println("You are wasting resource and our time ");
        } else if (withdrawAmt > 10000) {
            System.out.println("You can only withdraw upto 10000 once ");
        } else if (AccountInfo.getBalance() < withdrawAmt) {
            System.out.println("You only have : " + AccountInfo.getBalance() + " in your account");
        } else {
            int afterwithdraw = AccountInfo.getBalance() - withdrawAmt;
            System.out.printf("You withdrew : " + withdrawAmt);
            System.out.println("Your new balance is : " + afterwithdraw);

        }
    }
}


class Credentials {
    public static String passcode ;
    protected static String accNumber ;
    private static int userMobNumber ;

    public static String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    } 
    
    public static String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    } 
    public static int getUserMobNUmber(){
        return userMobNumber ;
    }
    public void setUserMobNumber(int userMobNumber){
        this.userMobNumber = userMobNumber ; 
    }
    public void changePassword(String newPassword){
        passcode = newPassword ;
    }
}

// class CrossVerification{
//     static int reversenum ;
//     int experiment = Credentials.getUserMobNUmber() ;
//     public static void Checkmob(int last4digit){
//         for(int i = 0 ; i < 4 ; i++){
//             reversenum = Credentials.getUserMobNUmber() % 10 ;
           
//         }
//     }
// }



public class NetBanking {
    public static void main(String[] args)
    {
        Credentials objCred = new Credentials();
        AccountInfo ObjBal = new AccountInfo();
        

        Scanner input = new Scanner(System.in);
        objCred.setAccNumber("Abhi0684");   // FOR NOW LET IT BE THIS 
        objCred.setPasscode("Java@1234");
        objCred.setUserMobNumber(82357726);


        System.out.println("Enter your UNIQUE IDENTIFICATION NUMBER : " );
        String uniqueID = input.nextLine(); 
        System.out.println("ENTER PASSCODE");
        String passcode = input.nextLine();


        if(passcode.equals(Credentials.getPasscode()) && uniqueID.equals(Credentials.getAccNumber())){

            ObjBal.setBalance(100000);

                // NOW TAKING USER INPUT FOR ITS CHOICE 
            System.out.println("What DO YOU WANT TO DO ?");
            System.out.println("EITHER ENTER THE CORRESPONDING CHAR OR TYPE IT ");
            System.out.println("A. CHECK BALANCE ");
            String CheckBal = "CHECK BALANCE" ;
            String A = "A" ; 
            System.out.println("B. DEPOSIT ");
            String deposit = "DEPOSIT" ;
            String B = "B" ;
            System.out.println("C. WITHDRAWL / TRANSFER ");
            String withdrawl = "WITHDRAWL" ;
            String transfer = "TRANSFER" ;
            String C = "C" ;
            System.out.println("D. WANT TO SEE YOUR UNIQUE ID ");
            String uniqueIDfetch = "WANT TO SEE YOUR UNIQUE ID" ;
            String D = "D" ;
            System.out.println("E. CHANGE PASSWORD");
            String change_passcode = "CHANGE PASSWORD" ;
            String E = "E" ;
            String Yes = "YES" ;
            String No = "No" ;
            String userChoice = input.nextLine();


        try {
            if(userChoice.equalsIgnoreCase(CheckBal) || userChoice.equalsIgnoreCase(A)){
                System.out.println("Your Account Balance is : " + AccountInfo.getBalance());
            }
            else if(userChoice.equalsIgnoreCase(deposit) || userChoice.equalsIgnoreCase(B)){
                System.out.println("Enter the amount you want to deposit : ");
                int DepoAmt = input.nextInt();
                DepositAmt.Deposit(DepoAmt);
            }else if(userChoice.equalsIgnoreCase(withdrawl) || userChoice.equalsIgnoreCase(C) || userChoice.equalsIgnoreCase(transfer)){
                System.out.println("Enter the amount you want to withdraw : ");
                int WithdAmt = input.nextInt();
                WithdrawlAction.Withdrawl(WithdAmt);
            }else if(userChoice.equalsIgnoreCase(uniqueIDfetch) || userChoice.equalsIgnoreCase(D)){
                System.out.println("ITS A PRIVATE CREDENTIAL TO SEE IT ENTER YOUR MOB NUM : ");
                int verificationNum = input.nextInt();
                if(verificationNum == Credentials.getUserMobNUmber()){
                    System.out.println("YOUR UNIQUE IDENTIFICATION VALUE is : ");
                    System.out.println(Credentials.getAccNumber());
                }
            }else if(userChoice.equalsIgnoreCase(change_passcode) || userChoice.equalsIgnoreCase(E)){
                System.out.println("Do You really want to change the password ?");
                String finalpasswordchangeOption = input.nextLine();
                if(finalpasswordchangeOption.equalsIgnoreCase(Yes)){
                    System.out.println("Enter your mobile number : ");
                    int verificationNumPass = input.nextInt();
                    if (verificationNumPass == Credentials.getUserMobNUmber()) {
                        System.out.println("OKAYYY OKAYYY YOU CAN CHANGE THE PASSWORD ");
                        System.out.println("BUT I AM LEARNING JDBC TILL THEN YOU HAVE TO CHANGE INSIDE THE PROGRAM : ");
                        String userPassCODE = input.nextLine();
                        objCred.changePassword(userPassCODE);   // This line isnt working 
                        System.out.println("YOUR PASSWORD HAS BEEN CHANGED ");
                    }else{
                        System.out.println("CREDENTIALS MISMATCHED !!!!");
                    }
                }
            
            }
        } catch (NetBankingE e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException c){
            System.out.println("Entered a wrong input ");
        }
        finally {
            System.out.println("THANK YOU FOR USING OUR Net Banking");
            System.out.println("YOUR MONEY IS SAFE WITH US ");
            input.close();
        }
    }
    else if(!passcode.equals(Credentials.getPasscode())){
        System.out.println("PASSWORD IS WRONG !!!!");
    }else if (!uniqueID.equals(Credentials.getAccNumber())){
        System.out.println("UNIQUE ID IS WRONG !!!!");
    }
    }
}