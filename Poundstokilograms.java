        //import scanner class
import java.util.Scanner;

public class Poundstokilograms {
    //* Takes doubole input number of pounds and returns the equivilent number of kilograms. */
    public static void main(String[] args) {
        //prompt user for number of pounds
        System.out.print("Enter the number of Pounds:");
        //store number of pounds
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        //convert to kilograms using kilograms = pounds * .454
        double kilograms = ((pounds * .454) * 100)/100;
        //return valyue of kilograms to user
        System.out.println(pounds + "lbs is " + kilograms + " kilograms.");
    }
}