import java.util.Scanner;

public class KilogramsToPoundsTable {
    /** Displays a table that can be user to convert a nunber of kilograms to pounds */
    public static void main(String[] args) {
        //import Scanner
        Scanner input = new Scanner(System.in);// declare new instance of Scanner
        int kilogram = 1; //declare kilogram
        System.out.println("Kilograms      Pounds");//print table formating
        System.out.println("-------------------------------");
        do {// do 
            System.out.printf("\n %-15.0f%-15.1f", (float)kilogram , ((float)kilogram * 2.2));//print formatted table kilogram + "    " + kilogram * 2.2
            kilogram++;//kilogram++
        } while (kilogram < 200);//while kilos < 200
    }
}