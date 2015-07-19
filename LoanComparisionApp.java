import java.util.Scanner;//import scanner class

public class LoanComparisionApp {
    /** Takes input of loan amount and loan term, and returns the monthly payment and interest rates for interest rates between 5% and 8% */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//new instance of scanner class
        System.out.print("Enter loan amount:");//prompt for loan amount
        String user_given_loan_amount = input.next();//declare and save user_given_loan_amount
        double loan_amount = Double.parseDouble(user_given_loan_amount);//convert loan amount
        System.out.print("Enter loan term:");//prompt for loan term in years
        String user_given_loan_term = input.next();//declare and save user_given_loan_term
        double loan_term = Double.parseDouble(user_given_loan_term);//convert loan_term
        double interest_rate = 5;//declare interest rate = 5
        System.out.println("Interest Rate       Monthly Payment     Total Payment       ");//print table columns
        System.out.println("------------------------------------------------------------");//print seperation line
        while (interest_rate <= 8) {//loop while interest rate < 8
            double total_loan_amount = loan_amount *  (1 + (interest_rate / 100));//declare and calculate total loan amount
            double monthly_payment = total_loan_amount / (loan_term * 12);//declare and calculate monthly payment
            System.out.printf("%-20.3f$%-19.2f$%-19.2f\n", (float)interest_rate , (float)monthly_payment , (float)total_loan_amount );//print format interestrate% MonthlyPayment TotalPayment
            interest_rate += .125;//interest rate+=.125 
        }//endloop
    }
}