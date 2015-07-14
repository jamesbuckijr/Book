        //import java.swing.JOptionPane
import javax.swing.JOptionPane;

public class InterestCalculator {
    /** To calculate the totla interest paid on a given loan, user inputs toal loan amount, annual interest rate, then returns the total interest */
    public static void main(String[] args) {
        
        //prompt and store user for total loan amount
        String loan_amount_from_user = JOptionPane.showInputDialog(null, "Enter total loan amount","eg. 30 or 5000");
        int loan_amount = Integer.parseInt(loan_amount_from_user);
        
        //prompt and store user for annual Interest Rate
        String interest_rate_from_user = JOptionPane.showInputDialog(null, "Enter Annual Interst amount" ,"eg 2.35 or 1.5");
        double interest_rate_whole_number = Double.parseDouble(interest_rate_from_user);
        
        //convert interest rate to decimal, and multiply by loan amount
        double interest_rate_decimal = interest_rate_whole_number / 100.0;
        double total_interest = ((loan_amount * interest_rate_decimal) * 100)/100.00;

        //Return total interest for loan
        String output_to_user = "For a loan amount of $" + loan_amount + " with an interest rate of " + interest_rate_whole_number + "%, the total amount of interest will be: $" + total_interest + ".";
        JOptionPane.showMessageDialog(null, output_to_user);
        
    }
}