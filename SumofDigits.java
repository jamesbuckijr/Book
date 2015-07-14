        //import scanner class
import java.util.Scanner;

public class SumofDigits {
    //* Take input of any three digit integer and return the sum of all digits to the user*/
    public static void main(String[] args) {
        //declare a new instnace of Scanner
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter a three digit number, for the sum of all digits:");
        //declare int user_given_number
        int user_given_number = input.nextInt();
        //store  in sum_of_digits modulo user_given_number by ten to read the tens place user_given_digit, then remove the tens place by dividing and overwritting user_given_number
        int sum_of_digits = (user_given_number % 10);
        user_given_number = user_given_number / 10;
        //store in sum_of_digits modulo user_given_number by ten to read the new tens place of user_given_digit, then remove the new tens place / 10 and overwriting user_given number
        sum_of_digits = sum_of_digits + (user_given_number % 10);
        user_given_number = user_given_number / 10;        
        //store in sum_of_digits modulo user_given_number by ten to read the new tens place of user_given_digit, then remove the new tens place / 10 and overwriting user_given_number
        sum_of_digits += user_given_number;
        //return value of sum_of_digits
        System.out.println("The sum of all digits is " + sum_of_digits + ".");
    }
}