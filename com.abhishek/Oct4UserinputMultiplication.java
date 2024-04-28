

import java.io.*;

public class Oct4UserinputMultiplication {

	public static void main(String[] args) {
		/*
		 * try{
		 * InputStreamReader in = new InputStreamReader(System.in);
		 * System.out.println("Enter any number : ");
		 * int number = in.read();
		 * while (in.ready()) {
		 * System.out.print((byte)number);
		 * number = in.read();
		 * }
		 * in.close();
		 * System.out.println();
		 * } catch (IOException e) {
		 * // TODO: handle exceptionchar
		 * System.out.println(e.getMessage());
		 * }
		 */
		try {
			FileOutputStream OutputStream = null ;
			FileReader in = new FileReader("TestingIO.txt");
			FileInputStream fr = new FileInputStream("TestingIO.txt");
			OutputStream = new FileOutputStream("TestingIO.txt");
			System.out.println("Enter any Text : ");
			String word = " I have written this " ;
			byte[] wordByte = word.getBytes();
			OutputStream.write(wordByte);
			int letter = fr.read();
			while (in.ready()) {
				System.out.print((char) letter);
				letter = in.read();
			}
			in.close();
			fr.close();
			OutputStream.close();
			System.out.println();
		} catch (IOException e) {
			// TODO: handle exceptionchar
			System.out.println(e.getMessage());

		}
	}
}
