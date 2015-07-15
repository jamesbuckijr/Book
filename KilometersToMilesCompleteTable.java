import java.util.Scanner;//import scanner class

public class KilometersToMilesCompleteTable {
    /** Generatees a table to convert Kilograms to miles and miles to kilograms */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//new instance of scanner
        System.out.println("Miles          Kilometers     Kilometers     Miles          ");//header formatting
        System.out.print("------------------------------------------------------------");
        int iterations = 0;// declare iterations
        do {//do
            System.out.printf("\n%-15.0f%-15.2f%-15.0f%-15.2f", (float)iterations, (float)iterations * 1.609 , (float)iterations , (float)iterations * .62 );
            iterations++;//print out formatted table
        } while(iterations < 200);//while (iterations < 200);
    }
}