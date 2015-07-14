        // import scanner
import java.util.Scanner;

public class Tipcalculator {
        //* Takes a bill calculates the tip percentage and returns the tip amount for 15% 20% 25%, and their total bill amount for each. */
    public static void main(String[] args) {
        //create a new instance of scanner class
        Scanner input = new Scanner(System.in);
        //prompt user for total bill
        System.out.print("Enter total bill:");
        //store total bill amount
        double bill = input.nextDouble();
        //return 15% tip and tip + bill
        System.out.println("Sub-total:" + bill + "  15% tip:" + (bill * .15) + "  Total with 15% tip:" + (bill *1.15));
        //return 20% tip and tip + bill
        System.out.println("Sub-total:" + bill + "  20% tip:" + (bill * .20) + "  Total with 20% tip:" + (bill *1.20));
        //return 25% tip and tip + bill
        System.out.println("Sub-total:" + bill + "  25% tip:" + (bill * .25) + "  Total with 25% tip:" + (bill *1.25));
    }
}