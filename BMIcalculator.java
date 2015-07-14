        //import javax.swing.JOptionPane
import javax.swing.JOptionPane;

public class BMIcalculator {
    /** Takes user's hieght (in inches) and weight (in pounds), and returns the user's BMI. */
    public static void main(String[] args) {
        //prompt user and store Height in inches into height_from_user
        String height_from_user = JOptionPane.showInputDialog(null, "Enter your hieght in inches" , "eg. 56 or 65");
        
        //convert hieight_from_user to double
        double height_in_inches = Double.parseDouble(height_from_user);
        
        //convert to height_in_kilograms
        double height_in_meters = height_in_inches * .0254 ;
        
        //prompt and store weight in weight_from_user
        String weight_from_user = JOptionPane.showInputDialog(null, "Enter your weight in pounds", "eg. 123 or 256");
        
        //convert weight_from_user to double
        double weight_in_pounds = Double.parseDouble(weight_from_user);
        
        //convert to weight_in_meters
        double weight_in_kilograms = weight_in_pounds * .45359237;
        
        //calculate BMI using formula weight_in_kilograms / (height_in_meters * height_in_meteres)
        
        double bmi = ((weight_in_kilograms / (height_in_meters * height_in_meters)) * 100 ) / 100.0;
        
        // return BMI
        String output = "For a person with a height of " + height_in_inches + " inches, and a weight of " + weight_in_pounds + " lbs, has a BMI of " + bmi + ".";
        JOptionPane.showMessageDialog(null, output );
    }
}