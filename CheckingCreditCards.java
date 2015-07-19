public class CheckingCreditCards {
    /** Checks to see if a given credit card number is valid */
    public static void main(String[] args) {
        //TESTS
        System.out.println(digitSumLong(1234));//10
        System.out.println(singleDigitDoubler(4));//8 
        System.out.println(singleDigitDoubler(8));//7
        System.out.println(evenDigitGrabber(12345678));//2468
        System.out.println(oddDigitGrabber(12345678));//1357
        System.out.println(multiDigitDoublerSum(123));//12
        System.out.println(multiDigitDoublerSum(1238));//19
        //EXECUTION
        System.out.println(isValid(2312435L));//true
        System.out.println(isValid(4388576018402625L));//false
    }
    //DIGIT SUM
    public static long digitSumLong(long number) {
        long digit_sum = 0;
        while (number != 0) {
            digit_sum += (number % 10);
            number /= 10;
        }
        return digit_sum;
    }
    //SINGLEDIGITDOUBLER
    public static long singleDigitDoubler(long number) {
        if ((number * 2) % 10 > 0) {
            return digitSumLong(number * 2);
        }
        return (number * 2);
               
    }
    //MULTI DIGIT DOUBLER AND SUM
    public static long multiDigitDoublerSum(long number) {
        long digit_sum = 0;
        while (number != 0) {
            digit_sum += singleDigitDoubler(number % 10) ;
            number /= 10;
        }
        return digit_sum;
    }
    //REVERSE LONG
    public static long reverseLong(long regular_number) {
        //returns the reverse of an long
        long reverse = 0;
        while (regular_number != 0) {
            reverse = (reverse *10)+(regular_number % 10);
            regular_number /= 10;
        }
        return reverse;
    }
    //ODD DIGIT GRABBER
    public static long oddDigitGrabber(long number) {
        //pull only odd digits, in reverse order
        number *= 10;
        long even_digits = 0;
        while (number != 0) {
            even_digits = (even_digits * 10) + ((number % 10) % 10);
            number /= 100;
        }
        //return to original order before returning
        long reverse = 0;
        while (even_digits != 0) {
            reverse = (reverse *10)+(even_digits % 10);
            even_digits /= 10;
        }
        return reverse;
    }
    //EVEN DIGIT GRABBER
    public static long evenDigitGrabber(long number) {
        //pull only even digits, in reverse order
        long even_digits = 0;
        while (number != 0) {
            even_digits = (even_digits * 10) + ((number % 10) % 10);
            number /= 100;
        }
        //return to original order before returning
        long reverse = 0;
        while (even_digits != 0) {
            reverse = (reverse *10)+(even_digits % 10);
            even_digits /= 10;
        }
        return reverse;
    }
    //VALIDATOR
    public static boolean isValid(long card_number) {
        //get sum of doubled even digits
        long sum_even_doubled = multiDigitDoublerSum(evenDigitGrabber(card_number));
        //get sum of doubled odd digits
        long sum_odd_doubled = multiDigitDoublerSum(oddDigitGrabber(card_number));
        //sum the sums if divisible by ten return true
        if ((sum_even_doubled + sum_odd_doubled) % 10 == 0) {
            return true;
            
        }
        return false;
    }
}