public class MeanArrays {
    public static void main(String[] args) {
        //TESTS
        int[] int_array_test = {1,2,3,4,5,6,7,8,9,10};
        double[] double_array_test = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        System.out.println(mean(int_array_test));
        System.out.println(mean(double_array_test));
    }
    public static double mean(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        double mean = sum / (double)array.length;
        return mean;
    }
    public static double mean(double[] array) {
        double sum = 0.0;
        for (int i = 0 ; i < array.length ; i++) {
            sum+= array[i];
        }
        double mean = sum / (double)array.length;
        return mean;
    }

}