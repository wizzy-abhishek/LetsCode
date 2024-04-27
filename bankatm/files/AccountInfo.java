package bankatm.files;


public class AccountInfo{
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