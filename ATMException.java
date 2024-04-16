//Let Someone is in ATM and and the limit for daily withdraw is 10,000 only write
//a code for ATM machine

import java.util.Scanner;

class ATM extends Exception {
    ATM(String X) {
        super(X);
    }
}

class ATMactions {
    private static int balance; // Initial balance

    public void setBalance(int b) {
        balance = b ;
    }

    public static int getBalance() {
        return balance;
    }

    public static void oldInfo() {

        System.out.println("Your balance is : " + getBalance());
    }

    public static void Deposit(int d) throws ATM {
        int afterDeposit = balance + d;
        if (d == 0) {
            throw new ATM("You are wasting resource and our time ");
        } else
            System.out.println("Your new balance is : " + afterDeposit);
    }

    public static void Withdrawl(int w) throws ATM {
        if (w <= 0) {
            throw new ATM("You are wasting resource and our time ");
        } else if (w > 10000) {
            throw new ATM("You can only withdraw upto 10000 once ");
        } else if (balance < w) {
            System.out.println("You only have : " + getBalance() + " in your account");
        } else {
            int afterwithdraw = balance - w;
            System.out.printf("You withdrew : " + w);
            System.out.println("Your new balance is : " + afterwithdraw);

        }
    }
}

public class ATMException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATMactions obj = new ATMactions();

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
                    System.out.println("THANK YOU FOR VISIT");
                }
            }
        } catch (ATM e) {
            System.out.println(e.getMessage());
        } catch (Exception g) {
            System.out.println(g.getMessage());
        } finally {
            input.close();
        }
    }
}