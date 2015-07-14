        //import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class IsItEven {
    /** Takes a whole integer as input from user and returns whether it is an even number or not. */
    public static void main(String[] args) {
        //prompt user for input
        String number_from_user = JOptionPane.showInputDialog(null, "Enter a whole number (no decimals)","eg. 1,3 or 8");
        int number = Integer.parseInt(number_from_user);
        
        //compare if number is divisible by two
        System.out.printf((number % 2 == 0) ? "The number %d is even \n" : "The number %d is odd \n" , number);
        
        //return result
    }
}