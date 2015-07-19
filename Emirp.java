public class Emirp {
    /** Displays the first 100 palindromic prime numbers */
    public static void main(String[] args) {
        //TEST outputs
        //System.out.println(reverseNumber(12));//should return 21
        //System.out.println(isPrime(3));//should return True
        //System.out.println(isPrime(4));//should reutrn false
        //System.out.println(isPrime(reverseNumber(31)));//should return true
        //System.out.println(isPrime(reverseNumber(44)));//should return false
        
        //program output
        printThePrimes();
    }
    public static int reverseNumber(int regular_number) {
        //returns the reverse of an int
        int reverse = 0;
        while (regular_number != 0) {
            reverse = (reverse *10)+(regular_number % 10);
            regular_number /= 10;
        }
        return reverse;
    }
    public static boolean isPrime(int test_number){
        //returns true if a number is prime 
        for (int i = 2 ; i < test_number ; i++) {
                if (test_number % i == 0)
                    return false;      
        }
        return true;
    }
    public static void printThePrimes() {
        //prints the first 100 palendromic prime numbers
        int total_printed = 0;
        int row_counter = 0;      
        for (int i = 1 ; total_printed < 100 ; i++) {
            if (row_counter >= 10) { //adds a line break once there are ten in a row
                System.out.print("\n");
                row_counter = 0;
            }
            if (isPrime(i) && isPrime(reverseNumber(i))) {
                System.out.printf("%-6d" , i);
                total_printed++;
                row_counter++;
            }
        }
    }
}