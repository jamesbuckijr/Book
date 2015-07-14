        //import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class SimplePayrollApp {
    /** This application takes the following information from the user:
        emplyee_name
        number_of_hours_worked_this_week
        hourly_pay
        federal_tax_Witholding_rate
        state_tax_withholding_rate
        
        Uses Basic GUI to prompt user for input, then displays all information as sampled:
            Employee's Name:
            Hours Worked:
            Pay Rate:
            Gross Pay:
            Deductions:
                Federal Witholding (%_from_input):
                State withholding (%_from_input):
            Net Pay:        
    */
    public static void main(String[] args) {
        
        //prompt user for Employee Name;declare employee name
        String employee_name = JOptionPane.showInputDialog(null,"Simple Payroll App","Please enter employee name");
        
        //prompt user for number of hours worked this week
        //declare double number of hours worked this week
        String hours_worked_user_entered = JOptionPane.showInputDialog(null,"Simple Payroll App","Please enter number of hours this week");
        int hours_worked_this_week = Integer.parseInt(hours_worked_user_entered);
        
        //prompt user for employee's hourly pay
        //declare employee's hoursly pay
        String hourly_payrate_from_user = JOptionPane.showInputDialog(null,"Simple Payroll App","Please enter " + employee_name + "\'s payrate");
        double hourly_payrate = Double.parseDouble(hourly_payrate_from_user);
        //Calculate gross pay
        
        double gross_pay = hours_worked_this_week * hourly_payrate;
        
        //prompt user for federal withholding percentage in whole integer
        //declare double for federeal withholding and divide by ten
        String federal_witholding_rate_whole_number_from_user = JOptionPane.showInputDialog(null,"Simple Payroll App", "Please enter the percent of federal withholding");
        int federal_witholding_rate_whole_number = Integer.parseInt(federal_witholding_rate_whole_number_from_user);
        
        //convert to decial percentage
        double federal_witholding_decimal = federal_witholding_rate_whole_number / 100.0;
        
        //prompt user for state withholding percentage in whole integer
        //declare double for state witholding and divide by ten
        String state_witholding_rate_whole_number_from_user = JOptionPane.showInputDialog(null,"Simple Payroll App", "Please enter the percent of state withholding");
        int state_witholding_rate_whole_number = Integer.parseInt(state_witholding_rate_whole_number_from_user);
        double state_witholding_rate_decimal = state_witholding_rate_whole_number / 100.0;
        
        //display the information to the user
        String output_to_user = "Name:" + employee_name + "\nHours Worked:" + hours_worked_this_week + "\nHourly Payrate:" + hourly_payrate + "\n Gross Pay:" + gross_pay + "\nDecductions:" + "\n\tFederal Withholding(" + federal_witholding_rate_whole_number +"%)" + (gross_pay * federal_witholding_decimal) + "\n\tState Witholdings(" + state_witholding_rate_whole_number +"%)" + (gross_pay * state_witholding_rate_decimal) + "\nNet Pay:" + (gross_pay - ((gross_pay * state_witholding_rate_decimal)+ (gross_pay * federal_witholding_decimal)));
        JOptionPane.showMessageDialog(null,output_to_user);
    }
}