public class FutureTuition {
    /** calculates tuition increases over ten years */
    public static void main(String[] args) {
        double tuition = 10000;
        System.out.println("Year Tuition  ");
        System.out.println("--------------");
        for(int i = 0;i < 10; i++) {
            System.out.printf("\n%-5.0f%-10.2f", (float)i , (float)tuition);
            tuition = (double)tuition * 1.05;
        }
    }
}