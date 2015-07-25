public class CustomMath {
    public static void main(String[] args) {
        //TESTS
        System.out.println(isPrime(1));//return TRUE
        System.out.println(isPrime(44));//return FALSE
        System.out.println(reverseInt(12345));//return 54321
        System.out.println(isPalindrome(1234321));//return TRUE
        System.out.println(isPalindrome(1234567));//return FALSE
        System.out.println(digitSumLong(1234));//10
        System.out.println(evenDigitGrabber(12345678));//2468
        System.out.println(oddDigitGrabber(12345678));//1357
        int[] int_array_test = {1,2,3,4,5,6,7,8,9,10};
        double[] double_array_test = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        System.out.println(mean(int_array_test));//5.5
        System.out.println(mean(double_array_test));//5.96
        System.out.println(smallestIntValue(int_array_test));//1
        System.out.println(sum(int_array_test));//45
    }
    public static boolean isPrime(int test_number){
        //returns true if a number is prime 
        for (int i = 2 ; i < test_number ; i++) {
                if (test_number % i == 0)
                    return false;      
        }
        return true;
    
    
}
    public static int reverseInt(int regular_number) {
        //returns the reverse of an int
        int reverse = 0;
        while (regular_number != 0) {
            reverse = (reverse *10)+(regular_number % 10);
            regular_number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
        //RETURNS TRUE IF PALINDROME; FALSE IF NOT PALINDROME
        if (number == reverseInt(number))
            return true;
        return false;
    }    
    public static int oddDigitGrabber(int number) {
        //pull only odd digits, in reverse order
        number *= 10;
        int even_digits = 0;
        while (number != 0) {
            even_digits = (even_digits * 10) + ((number % 10) % 10);
            number /= 100;
        }
        //return to original order before returning
        int reverse = 0;
        while (even_digits != 0) {
            reverse = (reverse *10)+(even_digits % 10);
            even_digits /= 10;
        }
        return reverse;
    }
    public static int evenDigitGrabber(int number) {
        //pull only even digits, in reverse order
        int even_digits = 0;
        while (number != 0) {
            even_digits = (even_digits * 10) + ((number % 10) % 10);
            number /= 100;
        }
        //return to original order before returning
        int reverse = 0;
        while (even_digits != 0) {
            reverse = (reverse *10)+(even_digits % 10);
            even_digits /= 10;
        }
        return reverse;
    }
    public static int digitSumInt(int number) {
        //sums the digits of an int
        int digit_sum = 0;
        while (number != 0) {
            digit_sum += (number % 10);
            number /= 10;
        }
        return digit_sum;
    }
    public static long digitSumLong(long number) {
        long digit_sum = 0;
        while (number != 0) {
            digit_sum += (number % 10);
            number /= 10;
        }
        return digit_sum;
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
    public static int smallestIntValue(int[] array) {
        int smallest = 9999999;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }
}