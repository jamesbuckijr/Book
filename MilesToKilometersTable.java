import java.util.Scanner;

public class MilesToKilometersTable {
    /** Display table that displays corresponding kilometers to miles */
    public static void main(String[] args) {
        //import Scanner
        Scanner input = new Scanner(System.in);// declare new instance of Scanner
        int miles = 1; //declare kilogram
        System.out.println("Miles          Kilometers");//print table formating
        System.out.println("-------------------------------");
        do {// do 
            System.out.printf("\n %-15.0f%-15.2f", (float)miles , ((float)miles * 1.609));//print formatted table kilogram + "    " + kilogram * 2.2
            miles++;//kilogram++
        } while (miles < 200);//while kilos < 200
    }
}