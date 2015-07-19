public class CheckingCreditCards {
    /** Checks to see if a given credit card number is valid */
    public static void main(String[] args) {
        //TESTS
        System.out.println(digitSumInt(1234));//10
        System.out.println(singleDigitDoubler(4));//8 
        System.out.println(singleDigitDoubler(8));//7
        System.out.println(evenDigitGrabber(12345678));//2468
        System.out.println(oddDigitGrabber(12345678));//1357
        System.out.println(multiDigitDoublerSum(123));//12
        System.out.println(multiDigitDoublerSum(1238));//19
        //EXECUTION
        //isValid(4388576018410707);//true
        //isValid(4388576018402625);//false
    }
    //DIGIT SUM
    public static int digitSumInt(int number) {
        int digit_sum = 0;
        while (number != 0) {
            digit_sum += (number % 10);
            number /= 10;
        }
        return digit_sum;
    }
    //SINGLEDIGITDOUBLER
    public static int singleDigitDoubler(int number) {
        if ((number * 2) % 10 > 0) {
            return digitSumInt(number * 2);
        }
        return (number * 2);
               
    }
    //MULTI DIGIT DOUBLER AND SUM
    public static int multiDigitDoublerSum(int number) {
        int digit_sum = 0;
        while (number != 0) {
            digit_sum += singleDigitDoubler(number % 10) ;
            number /= 10;
        }
        return digit_sum;
    }
    //REVERSE INT
    public static int reverseInt(int regular_number) {
        //returns the reverse of an int
        int reverse = 0;
        while (regular_number != 0) {
            reverse = (reverse *10)+(regular_number % 10);
            regular_number /= 10;
        }
        return reverse;
    }
    //ODD DIGIT GRABBER
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
    //EVEN DIGIT GRABBER
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
    //VALIDATOR
    public static boolean isValid(int card_number) {
        //get sum of doubled even digits
        int sum_even_doubled = multiDigitDoublerSum(evenDigitGrabber(card_number));
        //get sum of doubled odd digits
        int sum_odd_doubled = multiDigitDoublerSum(oddDigitGrabber(card_number));
        //sum the sums if divisible by ten return true
        if ((sum_even_doubled + sum_odd_doubled) % 10 == 0) 
            return true;
        return false;
    }
}