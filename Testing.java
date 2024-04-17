 import java.util.Scanner;
// public class Git {
//     public static void main(String Args[]){
//         // for(int i = 0 ; i <= 10 ; i++ ){
//         //     System.out.print("1 to 10 :" );
//         //     System.out.println( i + " ");
//         // }
//         char grade = 'A' ;

//     }
// }
// import java.util.Scanner;

// public class W12_P1 {
//     // Create a static function calculateGrade() to calculate the grade as needed and return to main() where it will automatically get printed
// public static char calculateGrade(int s){
//     if(s >= 80){
//         return 'A' ;
//       }
//       else if( s >= 70 && s <= 79){
//         return 'B' ;
//       }
//       else if( s >= 60 && s <= 69){
//         return 'C' ;
//       }
//       else if( s >= 50 && s <= 59){
//         return 'D' ;
//       }
//       else if( s >= 40 && s <= 49){
//         return 'P' ;
//       }
//       else if( s < 40){
//         return 'F';
//       }
//     return 'n' ; 
//     }
  
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     // System.out.print("Enter the numerical score: ");
//     int score = scanner.nextInt();
//     scanner.close();
//     // If score is greater than 100 or less than 0, print "Invalid Input"
//     if (score > 100 || score < 0) {
//         System.out.println("Invalid Input");
//         return;
//     }
//     char grade = calculateGrade(score);
//     System.out.println("Grade: " + grade);
// }
// }
public class Testing{
    public static void main(String[] args) {
        // String str = "Programming with java - nptel" ;
        // System.out.println(str.charAt(13+4) + str.substring(13+5 , 13+8));
        // int[] number = new int[5];
        // for(int i = 1 ; i < number.length ; i++){
        //     number[i] = i ;
        // }
        // for(int i = 1 ; i < number.length ; i++){
        //     System.out.println(number[i]);
        // }
        // String str = "Hello, World" ;
        // System.out.println(str.substring(7,12));

        // String str1 = "Hello";
        // String str2 = "Hello";
        // String str3 = new String("Hello");
        // System.out.println(str1 == str2);
        // System.out.println(str1 == str3);
        
        // try {
        //     int j = 10/0;
        // } catch (ArithmeticException e) {
        //     // TODO: handle exception
        //     System.out.println("A");
        // }finally{
        //     System.out.println("b");
        // }
        Scanner input = new Scanner(System.in);
        String passcode = input.nextLine();
        if(passcode.length() < 8){
            System.out.println("Passcode invalid");
        }
}
}
