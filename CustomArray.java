public class CustomArray {
    public static void main(String[] args) {
    
    }
    public static void printTwoDimentionalArray(int[][] array) {
        //Processes an array and prints out each row and column
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }       
}