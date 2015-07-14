        //import javax.swing.JOptionPane to push questions to user
import javax.swing.JOptionPane;
import java.lang.Math;

public class LearningToAdd {
    /** Generates a problem for a user to solve, if correct positive feedback, and generates a new problem.  If incorrect, notifies user and asks for solution again */
    public static void main(String[] args) {
        //declare new instance of random
        new java.util.Random();
        //declare and save variables
        int first_number = (int)Math.random() * 10;
        int second_number = (int)Math.random() * 10;
        
        String output_problem = "Please complete the following math problem:\n" + first_number + " + " + second_number + " = ____";
        
        //prompt user for solution to problem
        String answer_from_user = JOptionPane.showInputDialog(null,output_problem,"enter the solution");
        
        //convert to int
        int answer_number = Integer.parseInt(answer_from_user);
        
        //if solution == True
        if (answer_number == first_number + second_number)
            JOptionPane.showMessageDialog(null, "Good Job!");
        else {
            JOptionPane.showMessageDialog(null, "Bad Job!");
            answer_from_user = JOptionPane.showInputDialog(null,output_problem,"enter the solution");
        }
        //else
            //Bad job 
            //retry problem
    }
}