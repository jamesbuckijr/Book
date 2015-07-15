import javax.swing.JOptionPane;
import java.lang.Math;

public class SubtractionQuizLoop {
    /** Displays a series of ten subtraction problems, returns the number correct and how much time was spent on all problems */
    public static void main(String[] args) {
        //import javax.swing.JOptionPane;
        //import java.lang.Math;
        long start_time = System.currentTimeMillis();//get start time
        int number_correct = 0;//declare number_correct = 0;
        for (int i = 1; i < 10; i++) {//loop (total of 10 times):
            int first_number = (int)(Math.random() * 100);//generate first_number
            int second_number = (int)(Math.random() * 100);//generate second_number
            if (second_number > first_number) {// if second_number > first_number
                int temp = first_number;//switch them
                first_number = second_number;
                second_number = temp;
            }
            String problem = first_number + " - " + second_number; //create problem string
            String user_given_answer = JOptionPane.showInputDialog(null, problem, "answer here");//display/prompt user for input 
            int user_answer = Integer.parseInt(user_given_answer);//convert user_given_number
            if (user_answer == first_number - second_number) {//if user_number == first_number - second_number
                number_correct++; //number_correct++
                continue;//continue
            }
        }
        long end_time = System.currentTimeMillis();//get end time
        long test_time = (end_time - start_time) / 1000;//display result
        String ending_dialog = "You answered " + number_correct + " questions correctly.\nYou took " + test_time + " seconds to complete these questions.";
        JOptionPane.showMessageDialog(null, ending_dialog);
            
                
                

    }
}