import java.util.Scanner;//import scanner class

public class KilogramsToPoundsCompleteTable {
    /** Generatees a table to convert Kilograms to miles and miles to kilograms */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//new instance of scanner
        System.out.println("Pounds         Kilograms      Kilograms      Pounds         ");//header formatting
        System.out.print("------------------------------------------------------------");
        int iterations = 0;// declare iterations
        do {//do
            System.out.printf("\n%-15.0f%-15.2f%-15.0f%-15.1f", (float)iterations, (float)iterations * .4545 , (float)iterations , (float)iterations * 2.2 );
            iterations++;//print out formatted table
        } while(iterations < 200);//while (iterations < 200);
    }
}