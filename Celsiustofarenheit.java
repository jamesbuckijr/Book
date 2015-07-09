import java.util.Scanner;

public class Celsiustofarenheit {
    public static void main(String[] args) {
        //create scanner for input from console    
        Scanner input = new Scanner(System.in);
        //Ask for user input
        System.out.print("Enter the degrees in Celsius:");
        //declare int celsius variable
        int celsius = input.nextInt();
        //declare double and convert to farenheit using (9.0 / 5 ) * celsius + 32
        double farenheit = (9.0 / 5) * celsius + 32;
        // return string with final result
        System.out.println(celsius + " degress in Celsius is " + farenheit + " degrees in Farenheit.");
    }
}