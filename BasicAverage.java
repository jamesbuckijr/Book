import java.util.Scanner;

public class BasicAverage {
    /** Takes input of ten numbers and returns the mean */
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);//new instance of scanner
        int[] numbers = new int[10];//declare new array numbers
        int sum = 0;//declare sum
        for (int i = 1; i < 11 ;i++) {//for loop
            System.out.print("Enter number " + i +": ");//prompt user for input
            String temp_storage = input.next();//store input/convert input
            numbers[i - 1] = Integer.parseInt(temp_storage);//store in array
            sum += numbers[i - 1];
        }
        double mean = (double)sum / 10;//compute mean
        System.out.printf("The mean of all ten numbers is: %-10.2f" , mean);//return mean
    }
}