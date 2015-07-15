import java.util.Scanner;//import scanner class

public class FindingTheHighestScores {
    /** Takes a number as input for number of students and scores, returns the two highest scores of the list */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//declare new instance of Scanner class
        float highest_score = 0;//declare highest_score
        String highest_user = "";//declare highest_user
        float second_highest_score = 0;//declare second_highest_score
        String second_highest_user = "";//declare second_highest_user
        System.out.print("Please enter the number of students:");//prompt for iterations
        String user_given_number_of_iterations = input.nextLine();//declare/prompt iterations (number of students)
        int iterations = Integer.parseInt(user_given_number_of_iterations);//convert to int 
        for (int i = 0 ; i < iterations ; i++) {//while number_of_students < iterations
            System.out.print("Eneter Student first name:");//prompt for user_given_student_name
            String user_given_student_name = input.nextLine();
            System.out.printf("Enter the score for %s:", user_given_student_name);//prompt for user_given_student_score
            String user_given_student_score_raw = input.nextLine();
            float user_given_student_score = Float.parseFloat(user_given_student_score_raw);
            if (user_given_student_score > highest_score) {//if user_given_student_score > highest_score
                second_highest_score = highest_score;//second_highest_score = highest_score
                second_highest_user = highest_user;//second_highest_user = highest_user
                highest_score = user_given_student_score;//highest_score = user_given_student_score
                highest_user = user_given_student_name;//highest_user = user_given_student_name
            }
            else if (user_given_student_score < highest_score && user_given_student_score > second_highest_score) {//else if user_given_student_score < highest_score && user_given_student_score > second_highest_score
                second_highest_score = user_given_student_score;//second_highest_score = user_given_student_score
                second_highest_user = user_given_student_name;//second_highest_user = user_given_student_name
            }
            else {//else
                continue;//continue
            }
        }//end loop
        System.out.printf("Rank Student   Score");//return formatted data Student Rank, Name , Score
        System.out.printf("\n--------------------");
        System.out.printf("\n1    %-10s%-5.0f", highest_user, highest_score);
        System.out.printf("\n2    %-10s%-5.0f\n", second_highest_user, second_highest_score);
    }
}