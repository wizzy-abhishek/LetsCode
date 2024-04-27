package bankatm.files;

public class Credentials {
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