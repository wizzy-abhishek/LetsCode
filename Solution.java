
import java.util.Scanner;

class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15 ;
        double Fahrenheit = celsius * 1.80 + 32.00 ; 
        double[] array = new double[2];
        array[0] = Kelvin;
        array[1] = Fahrenheit;
        return array; 
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Solution obj = new Solution();
        double X = input.nextInt();
        obj.convertTemperature(X);
    }
}