

import java.util.Scanner;
class Oct4_userinput_Add{
	public static void main(String[] args){
	Scanner Sc = new Scanner(System.in);
	float a,b,c;
	System.out.println("First Value :");
	a = Sc.nextFloat();

	System.out.println("Second Value :");
	b = Sc.nextFloat();

	c = a+b;
	System.out.println("Result_" + c);
}
}