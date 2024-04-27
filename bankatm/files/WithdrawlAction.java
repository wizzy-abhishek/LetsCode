package bankatm.files;

public class WithdrawlAction{
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
