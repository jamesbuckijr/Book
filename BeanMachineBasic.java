import java.util.Scanner;//numberOfBalls

public class BeanMachineBasic{
    public static void main(String[] args) {
        
    }
    public static int randOneZero() { //GENERATE RANDOM LEFT OR RIGHT
        //method that generates random number either 1 or 0
        double random_number = Math.random();
        int rand_int = (random_number >= .50) ? 1 : 0;
        return rand_int;
    }    
    public static void ballPath() {//GENERATE PATH OF INDIVIDUAL BALL
        
    }
    public static int numberOfBalls() {//GENERATE REQUESTED NUMBER OF BALLS
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of iterations:");
        String user_input = input.next();
        int num_of_iterations = 
    }
    //RUN SIMULATION REQUESTED NUMBER OF TIMES
    //GENERATE AND RETURN HISTOGRAM
    
}