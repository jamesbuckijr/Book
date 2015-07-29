import java.util.Scanner;//numberOfBalls
import java.lang.Math;


//RANDOM SLOTS HAVE NO BALLS 
//WHEN MORE THAN TEN SLOTS HISTOGRAM IS OFF

public class BeanMachineBasic{
    public static void main(String[] args) {
        tests();
    }
    public static void tests() {
        //randOneZero();
        //numberOfBalls();
        //System.out.println(ballPath(5));
        //TEST
        
        //int[] test_array = beanMachineRun();
        returnHistogram();
    }    
    public static int randOneZero() { //GENERATE RANDOM LEFT OR RIGHT
        //method that generates random number either 1 or 0
        double random_number = Math.random();
        int rand_int = (random_number >= .50) ? 1 : 0;
        return rand_int;
    }    
    public static int ballPath(int number_of_slots) {//GENERATE PATH OF INDIVIDUAL BALL
        //eight total columns at the end; generate seven choices
        int peg_rows = number_of_slots - 1;
        int peg_rows_left = peg_rows;
        int ball_position = number_of_slots / 2;
        while (peg_rows_left != 0) {
            int random = randOneZero();
            if (random == 1)
                ball_position += 1;
            if (random == 0)
                ball_position -= 1;
            if (ball_position >= peg_rows)
                ball_position = peg_rows;
            if (ball_position <= 0)
                ball_position = 0;
            peg_rows_left--;
            char direction = (random == 1) ? 'R' : 'L';
            System.out.print(direction);
        }
        System.out.print("\n");
        return ball_position;
    }
    public static int numberOfBalls() {//GENERATE REQUESTED NUMBER OF BALLS
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of balls:");
        String user_input = input.next();
        int num_of_balls = Integer.parseInt(user_input);
        return num_of_balls;
    }
    public static int numberOfSlots() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of slots:");
        String user_input = input.next();
        int num_of_slots = Integer.parseInt(user_input);
        return num_of_slots;
    }
    public static int[] beanMachineRun() {
        //RUN SIMULATION REQUESTED NUMBER OF TIMES
        int number_of_balls = numberOfBalls();
        int number_of_slots = numberOfSlots();
        int[] results = new int[number_of_slots];
        for (int i = 0 ; i < number_of_balls ;i++) {
            int ball_position = ballPath(number_of_slots);
            results[ball_position] += 1;
        }
        return results;
    }
    public static int largestArrayValue(int[] array) {
        //returns largest value in an int array
        int largest_value = 0;
        for (int i = 0 ; i < array.length ;i++) {
            if (array[i] > largest_value)
                largest_value = array[i];
        }
        return largest_value;
    }
    public static void returnHistogram() {//GENERATE AND RETURN HISTOGRAM
        int[] machine_run = beanMachineRun();
        int[][] histogram = new int[largestArrayValue(machine_run)][];
        for (int i = largestArrayValue(machine_run) ; i > 0 ;i--) {
            System.out.print("\n");
            for (int j = 0 ; j < machine_run.length ;j++) {
                if (machine_run[j] < i)
                    System.out.print(" ");
                if (machine_run[j] >= i)
                    System.out.print("O");
            }
        }
        System.out.print("\n");
        for (int i = 1 ; i <= machine_run.length ; i++) {
            System.out.print(i);
        }
        System.out.print("\n");
    }
}