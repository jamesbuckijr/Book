import java.util.Scanner;//import scanner clas

public class PrintPaymentSchedule {
    /** takes input of Loan amount, loan term, and percent; and returns Monthly payment, total loan payment, and schedlue of payments: payment # interest paid , principal paid, and remaining balance. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//new instance of scanner class
        System.out.print("Enter loan amount:");//prompt user for total loan amount
        String loan_amount_from_user = input.next();//save loan amount
        double loan_amount = Double.parseDouble(loan_amount_from_user);//convert loan amount
        System.out.print("Enter loan term in years:");//prompt user for loan term
        String loan_term_from_user = input.next();//save loan term from user
        double loan_term = Double.parseDouble(loan_term_from_user);//convert loan term
        System.out.print("Enter loan interest rate in whole percent:");//prompt user for the interest on loan in percent
        String interest_rate_from_user = input.next();//save user loan interest
        double interest_rate = ((Double.parseDouble(interest_rate_from_user) / 100) + 1);//convert user loan interest
        double total_loan_amount = loan_amount * interest_rate;//declare total loan amount
        double monthly_payment = total_loan_amount / (loan_term * 12);//declare monthly payment = total loan amount * interest blah
        final double monthly_payment_static = monthly_payment;
        System.out.println("Loan Amount: $" + loan_amount + "\nLoan Term(years): " + loan_term + "\nAnnual interest rate: " + interest_rate_from_user + "%");//print total loan and payments to screen
        System.out.println();//print table formatting
        System.out.println("Monthly Payment: $" + (monthly_payment/100) * 100);
        System.out.println("Total Payment: $" + (total_loan_amount/100) * 100);
        System.out.println();
        System.out.println("Payment Number      Interest            Principal           Balance             "  );
        System.out.println("--------------------------------------------------------------------------------");
        int payment_number = 1;//declare payment number = 1
        do {//loop while loan amount > 0
            double interest_payment = monthly_payment_static * (interest_rate - 1);//interest payment = monthly payment * interest rate
            double principal_payment = monthly_payment_static - interest_payment;//principal payment = monthly payment - interest payment
            total_loan_amount -= monthly_payment_static;//total loan amount -= monthly payment
            String output = "%-20d%-20.2f%-20.2f%-20.2f\n";
            System.out.printf(output, payment_number , interest_payment , principal_payment , total_loan_amount);
            payment_number++;//payment iteration
        } while (total_loan_amount > 0);//end loop
        
    }
}