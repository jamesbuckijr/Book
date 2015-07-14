        //import java.swing.JOptionPane;
import javax.swing.JOptionPane;

public class IsItATriangle {
    public static void main(String[] args) {
        
        //prompt and store first side value
        String first_side_from_user = JOptionPane.showInputDialog(null,"Enter length of first side","eg. 5 or 2");
        
        //convert to double
        double first_side = Double.parseDouble(first_side_from_user);
        
        //prompt and store second side value
        String second_side_from_user = JOptionPane.showInputDialog(null,"Enter length of second side","eg. 5 or 2");
        
        //convert to double\
        double second_side = Double.parseDouble(second_side_from_user);
        
        //prompt and store third side value
        String third_side_from_user = JOptionPane.showInputDialog(null,"Enter length of third side","eg. 5 or 2");
            
        //convert to double
        double third_side = Double.parseDouble(third_side_from_user);
        
        //compare sides and return true if it is a triangle
        if (first_side + second_side > third_side) {
            if (second_side + third_side > first_side) {
                if (third_side + first_side > second_side) {
                       System.out.printf("The side lengths %f, %f, and %f can make a triangle.", first_side , second_side , third_side);
                }
                else {
                    System.out.printf("The side lengths %f, %f, and %f do not make a triangle.", first_side , second_side , third_side);
                    System.exit(0);
                }
            }
            else {
                System.out.printf("The side lengths %f, %f, and %f do not make a triangle.", first_side , second_side , third_side);
                System.exit(0);
            }
        }
        else {
            System.out.printf("The side lengths %f, %f, and %f do not make a triangle.", first_side , second_side , third_side);
            System.exit(0);
        }
    }
}