
import java.util.Scanner;

class Add {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int begin = input.nextInt();
		int end = input.nextInt();
		for (int i = begin; i >= end; i--) {
			System.out.println(i * i);
		}
		for (int i = end; i <= begin; i++) {
			System.out.println(i * i);
		}
		input.close();
	}

}