
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;

public class WriteInFile {
    public static void main(String[] args) {
        char[] alphabet = {'G','A','R','G','I'} ;
        FileWriter filewrite ;
        FileOutputStream byteOut ;
        String filename = "Ab.txt";
        int G = 71;
        char Ga = 'G';

       try {
        filewrite = new FileWriter(filename);
        byteOut = new FileOutputStream("gargi.txt");
        filewrite.write(alphabet);
        filewrite.close();
        byteOut.write(G);
        byteOut.write(Ga);
        byteOut.close();
       } catch (IOException e) {
        System.out.println(e.getMessage());
       } 
    }
}
