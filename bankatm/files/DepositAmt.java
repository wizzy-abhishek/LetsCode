package bankatm.files;

class DepositAmt {

    public static void Deposit(int depositAmount) throws NetBankingE {
        int afterDeposit = AccountInfo.getBalance() + depositAmount;
        if (depositAmount == 0) {
            System.out.println("No Money Added");
        } else
            System.out.println("Your new balance is : " + afterDeposit);
    }
}

