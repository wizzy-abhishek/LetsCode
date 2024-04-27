import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class ReadFile {
    public static void main(String[] args) {
        FileReader readFile ;
       // CharBuffer reading; 
        try {
            readFile = new FileReader("Abc.txt");
            int i;    
            while((i=readFile.read())!=-1)    
            System.out.print((char)i); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
