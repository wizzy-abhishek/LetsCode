import java.util.Scanner;
import java.io.*;
import java.net.*;

public class IOFile {
    public static void main(String[] args) {
         // Scanner input = new Scanner("LearingIO.txt");
        // String feedingData = input.nextLine();
       // System.out.println(LearingIO.txt);
      //input.close();
    
    try{  @SuppressWarnings("deprecation")
    URL url = new URL("https://nptel.ac.in/course.php");
        System.out.println(url.getFile());
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
