import java.lang.Math;

public class StandardDeviation {
    /** returns the standard deviation of an array of int or double numbers; overloaded methods. */
    public static void main(String[] args) {
        //TESTS
        int[] int_array_test = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(standardDeviation(int_array_test));
        double[] double_array_test = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        System.out.println(standardDeviation(double_array_test));
    }
    public static double standardDeviation(int[] array) {
        //import java.lang.Math
        int sum_of_array = sum(array);//find sum of array
        double mean_of_array = mean(array);
        double root = 0.0;
        for(int i = 0 ; i < array.length ; i++) {
            root += (array[i] - mean_of_array) * (array[i] - mean_of_array); 
        }         
        double standard_deviation = Math.sqrt(root);  //sqrt( for(int i = 0 ; i < array.length ; i++) { (array[i] - mean) * (array[i] - mean) } );
        return standard_deviation;
    }
    public static double standardDeviation(double[] array) {
        //import java.lang.Math
        double sum_of_array = sum(array);//find sum of array
        double mean_of_array = mean(array);
        double root = 0.0;
        for(int i = 0 ; i < array.length ; i++) {
            root += (array[i] - mean_of_array) * (array[i] - mean_of_array); 
        }         
        double standard_deviation = Math.sqrt(root);  //sqrt( for(int i = 0 ; i < array.length ; i++) { (array[i] - mean) * (array[i] - mean) } );
        return standard_deviation;
    } 
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        double mean = sum / (double)array.length;
        return mean;
    }
    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0 ; i < array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }        
    public static double mean(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        double mean = sum / (double)array.length;
        return mean;
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }    
}