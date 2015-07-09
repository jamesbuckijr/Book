public class ChapterTwo {
    public static void main(String[] args) {
        //declare double named miles value of 100
        double miles = 100;
        //declare double constant named MILE_TO_KILOMETER
        final double MILE_TO_KILOMETER = 1.609;
        //declare double name kilometer
        double kilometers = miles * MILE_TO_KILOMETER;
        //display kilometer to the console
        System.out.println( miles + " miles are equal to " + kilometers + " kilometers.");
    }
}