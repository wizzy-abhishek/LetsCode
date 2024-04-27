import java.io.*;

public class IOLearn {
    public static void main(String[] args) {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
        try {
            System.out.println("Enter your text : ");
            String userInput = bf.readLine();
            Integer.parseInt(userInput);
            String userInput2 = bf.readLine();
            Integer.parseInt(userInput2);
            System.out.println("You entered : " + userInput + userInput2);
            in.close();
            bf.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{

        }
    }
}
