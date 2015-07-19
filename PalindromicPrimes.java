public class PalindromicPrimes {
    /** Returns the first 100 palendromic Prime numbers */
    public static void main(String[] args) {
        //TEST
        //System.out.println(isPrime(1));//return TRUE
        //System.out.println(isPrime(44));//return FALSE
        //System.out.println(reverseInt(12345));//return 54321
        //System.out.println(isPalindrome(1234321));//return TRUE
        //System.out.println(isPalindrome(1234567));//return FALSE
        //Program
        oneHundredPP();
    }
    //TEST FOR PRIME
    public static boolean isPrime(int test_number){
        //returns true if a number is prime 
        for (int i = 2 ; i < test_number ; i++) {
                if (test_number % i == 0)
                    return false;      
        }
        return true;
    }    
    //CONVERT TO PALENDROME'
    public static int reverseInt(int regular_number) {
        //returns the reverse of an int
        int reverse = 0;
        while (regular_number != 0) {
            reverse = (reverse *10)+(regular_number % 10);
            regular_number /= 10;
        }
        return reverse;
    }
    //TEST FOR PALENDROME
    public static boolean isPalindrome(int number) {
        if (number == reverseInt(number))
            return true;
        return false;
    }
    //OUTPUT FORMATING
    public static void oneHundredPP() {
        int printed_count = 0;
        int row_count = 0;
        for (int i = 1; printed_count < 100 ; i++) {
            if (isPalindrome(i)) {
                if (row_count >= 10) {
                System.out.print("\n");
                row_count = 0;
                }            
                if (isPrime(i) && isPrime(reverseInt(i))){
                    System.out.printf("%-6d" , i);
                    printed_count++;
                    row_count++;
                }
            }
        }
    }
}