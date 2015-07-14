        //import java.util.Scanner
import java.util.Scanner;

public class DivisibleByFiveAndSix {
    /** Takes input of an integer from the user, and determines if the number is divisible by both 5 and 6 */
    public static void main(String[] args) {
        //new instance of Scanner class
        Scanner input = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter a whole number ");
        
        //store user input
        int number = input.nextInt();
        
        //if divisible by both return positive
        //if not divisible by both return negative
        System.out.printf(((number % 5 == 0) && (number % 6 ==0)) ? "%d is divisible by five and six. \n" : "%d is not divisible by both five and six. \n" , number);
        

    }
}