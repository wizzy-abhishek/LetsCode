// // // import java.util.Scanner;
// // // // public class Git {
// // // //     public static void main(String Args[]){
// // // //         // for(int i = 0 ; i <= 10 ; i++ ){
// // // //         //     System.out.print("1 to 10 :" );
// // // //         //     System.out.println( i + " ");
// // // //         // }
// // // //         char grade = 'A' ;

// // // //     }
// // // // }
// // // // import java.util.Scanner;

// // // // public class W12_P1 {
// // // //     // Create a static function calculateGrade() to calculate the grade as needed and return to main() where it will automatically get printed
// // // // public static char calculateGrade(int s){
// // // //     if(s >= 80){
// // // //         return 'A' ;
// // // //       }
// // // //       else if( s >= 70 && s <= 79){
// // // //         return 'B' ;
// // // //       }
// // // //       else if( s >= 60 && s <= 69){
// // // //         return 'C' ;
// // // //       }
// // // //       else if( s >= 50 && s <= 59){
// // // //         return 'D' ;
// // // //       }
// // // //       else if( s >= 40 && s <= 49){
// // // //         return 'P' ;
// // // //       }
// // // //       else if( s < 40){
// // // //         return 'F';
// // // //       }
// // // //     return 'n' ; 
// // // //     }

// // // //   public static void main(String[] args) {
// // // //     Scanner scanner = new Scanner(System.in);
// // // //     // System.out.print("Enter the numerical score: ");
// // // //     int score = scanner.nextInt();
// // // //     scanner.close();
// // // //     // If score is greater than 100 or less than 0, print "Invalid Input"
// // // //     if (score > 100 || score < 0) {
// // // //         System.out.println("Invalid Input");
// // // //         return;
// // // //     }
// // // //     char grade = calculateGrade(score);
// // // //     System.out.println("Grade: " + grade);
// // // // }
// // // // }
// // // // public class Testing {
// // // //         public static void main(String[] args) {
// // // // String str = "Programming with java - nptel" ;
// // // // System.out.println(str.charAt(13+4) + str.substring(13+5 , 13+8));
// // // // int[] number = new int[5];
// // // // for(int i = 1 ; i < number.length ; i++){
// // // // number[i] = i ;
// // // // }
// // // // for(int i = 1 ; i < number.length ; i++){
// // // // System.out.println(number[i]);
// // // // }
// // // // String str = "Hello, World" ;
// // // // System.out.println(str.substring(7,12));

// // // // String str1 = "Hello";
// // // // String str2 = "Hello";
// // // // String str3 = new String("Hello");
// // // // System.out.println(str1 == str2);
// // // // System.out.println(str1 == str3);

// // // // try {
// // // // int j = 10/0;
// // // // } catch (ArithmeticException e) {
// // // // // TODO: handle exception
// // // // System.out.println("A");
// // // // }finally{
// // // // System.out.println("b");
// // // // }
// // // // Scanner input = new Scanner(System.in);
// // // // String passcode = input.nextLine();
// // // // if(passcode.length() < 8){
// // // // System.out.println("Passcode invalid");
// // // // }

// // // // your code goes here
// // // //                 Scanner input = new Scanner(System.in);
// // // //                 int T = input.nextInt();
// // // //                 while (T-- > 0) {
// // // //                         int A = input.nextInt();
// // // //                         int B = input.nextInt();
// // // //                         int Z = A ;
// // // //                         int Y = B ;
// // // //                         int Aa = 0;
// // // //                         int Ba = 0; 
// // // //                         for(int i = 0 ; i <= 1 ; i++ ){
// // // //                                 Aa = Z % 10 + Aa * 10;
// // // //                                 Z /= 10 ;
// // // //                         }
// // // //                         System.out.println("Aa " + Aa);
// // // //                         System.out.println(A);
// // // //                         while (Y != 0) {
// // // //                                 Ba = Y % 10 + Ba * 10;
// // // //                                 Y /= 10;
// // // //                         }

// // // //                         System.out.println("Ba " + Ba);
// // // //                         System.out.println(B);
// // // //                         if (A > B || Aa > B || A > Ba || Aa > Ba) {
// // // //                                 System.out.println("YES");
// // // //                         } else {
// // // //                                 System.out.println("No");
// // // //                         }
// // // //                 }

// // // //         }
// // // // }

// // // public class W12_P2 {

// // //     char ch;
// // //     int word_count = 0;
// // //     String longest_word = "";
// // //     int vowel_count = 0;

// // //     public void NumOfWords(String X) {
// // //         for (int i = 0; i < X.length(); i++) {
// // //             ch = X.charAt(i);
// // //             if (ch == ' ') {
// // //                 word_count++;
// // //             }
// // //             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// // //                 vowel_count++;
// // //             }
// // //         }
// // //         System.out.println(word_count + 1);
// // //         System.out.println(vowel_count);
// // //     }

// // //     public static void main(String args[]) {

// // //         Scanner input = new Scanner(System.in);
// // //         String sentence = input.nextLine();
// // //         W12_P2 obj = new W12_P2();
// // //         obj.NumOfWords(sentence);
// // //         input.close();

// // //         // if(passcode.length() > 8){
// // //         // System.out.println("Your password is invalid.");
// // //         // System.out.println("The password must be at least 8 characters long.");
// // //         // }
// // //         // else if(!hasUpperCaseLetter(passcode)){
// // //         // System.out.println("Your password is invalid.");
// // //         // System.out.println("The password must contain at least one uppercase letter
// // //         // (A-Z).");
// // //         // }
// // //         // else if(!hasLowerCaseLetter(passcode)){
// // //         // System.out.println("Your password is invalid.");
// // //         // System.out.println("The password must contain at least one lowercase letter
// // //         // (A-Z).");
// // //         // }
// // //         // else if(!hasDigit(passcode)){
// // //         // System.out.println("Your password is invalid.");
// // //         // System.out.println("The password must contain at least one digit (0-9).");
// // //         // }
// // //         // else{
// // //         // System.out.println("Your password is valid.");
// // //         // }
// // //         // }

// // //         // private static boolean hasDigit(String passcode) {
// // //         // // TODO Auto-generated method stub
// // //         // throw new UnsupportedOperationException("Unimplemented method 'hasDigit'");
// // //         // }

// // //         // private static boolean hasLowerCaseLetter(String passcode) {
// // //         // // TODO Auto-generated method stub
// // //         // throw new UnsupportedOperationException("Unimplemented method
// // //         // 'hasLowerCaseLetter'");
// // //         // }

// // //         // private static boolean hasUpperCaseLetter(String passcode) {
// // //         // // TODO Auto-generated method stub
// // //         // throw new UnsupportedOperationException("Unimplemented method
// // //         // 'hasUpperCaseLetter'");
// // //         // }
// // //     }
// // // }
// // // This is where you will write the code:
// // // 1. Split the text into words using a suitable delimiter (e.g., space).
// // // 2. Initialize variables to store the word count, longest word, and vowel count.
// // // 3. Loop through each word:
// // //     - Update the word count.
// // //     - Check if the current word is longer than the current longest word and update if necessary.
// // //     - Count the vowels in the current word and add it to the total vowel count.
// // // 4. After the loop, print the calculated results (word count, longest word, vowel count).

// // import java.util.*;

// // class W12_P3 {
// //     char ch;
// //     int word_count = 0;
//    //  String longest_word = "";
     
// //     int vowel_count = 0;

// //     public void NumOfWords(String X) {
       
// //         for (int i = 0; i < X.length(); i++) {
// //             ch = X.charAt(i);
// //             if (ch == ' ') {
// //                 word_count++;
// //             }
// //             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// //                 vowel_count++;
// //             }
// //         }
// //         int Number_of_words = word_count + 1;
// //         System.out.println("Number of words: " + Number_of_words);
// //         System.out.println("Longest word: " + longest_word);
// //         System.out.println("Vowel count: " + vowel_count);
        
// //     }

// //     public static void main(String args[]) {

// //         Scanner input = new Scanner(System.in);
// //         String sentence = input.nextLine();
// //         W12_P3 obj = new W12_P3();
// //         obj.NumOfWords(sentence);
// //         input.close();
// //     }
// // }
// import java.util.Scanner;

// abstract class Shape {
//     protected abstract void calcArea();
//     public abstract void printArea();
// }
// // Implement 3 classes here:
// class Circle extends Shape {
//     private String shapeType;
//     private double area;
//     private double radius ;
//       public Circle(String shapeType , double radius){
//         this.shapeType = shapeType ;
//           this.radius = radius ;
//       }
      
//       protected void calcArea(){
//         area = Math.PI * radius * radius ;
//       }
//       public void printArea(){
//         System.out.println("Area of Circle: " + area);
//       } 
//     }
//     class Rectangle extends Shape {
//     private String shapeType;
//     private double area;
//     private double sides ;
//     private double sides2 ; 
//       public Rectangle(String shapeType , double sides , double sides2){
//         this.shapeType = shapeType ;
//           this.sides = sides ;
//         this.sides2 = sides2 ;
//       }
//       protected void calcArea(){
//         area = sides * sides2 ;
//       }
//       public void printArea(){
//         System.out.println("Area of Rectangle: " + area);
//       } 
//     }
    
//     class Square extends Shape {
//         private String shapeType;
//         private double area;
//         private double side ;
//       public Square(String shapeType , double side){
//         this.shapeType = shapeType ;
//           this.side = side ;
//       }
//       protected void calcArea(){
//         area = side * side ;
//       }
//       public void printArea(){
//         System.out.println("Area of Square: " + area);
//       } 
//     }
//     public class W12_P4 {

//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             // System.out.print("Enter shape type (Circle, Rectangle or Square): ");
//             String shapeType = scanner.nextLine();
//             // System.out.print("Enter first dimension: ");
//             double arg1 = scanner.nextDouble();
//             Shape shape = null;
//             if (shapeType.equalsIgnoreCase("Circle")) {
//                 shape = new Circle(shapeType, arg1);
//             } else if (shapeType.equalsIgnoreCase("Rectangle")) {
//                 double arg2 = scanner.nextDouble();
//                 shape = new Rectangle(shapeType, arg1, arg2);
//             } else if (shapeType.equalsIgnoreCase("Square")) {
//                 shape = new Square(shapeType, arg1);
//             } else {
//                 System.out.println("Invalid shape type");
//                 scanner.close();
//                 return;
//             }
//             shape.calcArea();
//             shape.printArea();
//             scanner.close();
//         }
//     }
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T --> 0){
		        //int N = input.nextInt();
		        String S = input.nextLine();
				String small = "";
				char ch ;
		        for(int i = 0 ; i + 4 < S.length() ; i++){
		                small = S.substring(i , i + 4); 
		                for(int j = 0 ; j < 4 ; j++){
		                        ch = small.charAt(i);
		                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		                                System.out.println("YES");
		                        }
		                }
		        }
		}

	}
}
