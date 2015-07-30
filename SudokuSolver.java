import java.util.Scanner;

public class SudokuSolver {
    /** Takes input row by row for a sudoku puzzle and returns the solution in the form of an array  */
    public static void main(String[] args) {
        tests();
    }
    public static void tests() {
        getBoard();
    }
    public static int[][]*/void getBoard() {
        //GET INPUT FROM USER; RETURN CURRENT NUMBERS IN ARRAY
        int[][] board = new int[9][9];
        System.out.println("Welcome to Sudoku Solver.\nPlease enter the unsolved Sudoku puzzle starting with the top row entering zero for missing numbers, leaving space between each:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9;i++) {
            System.out.printf("Row%3d|" , i + 1);
            for (int j = 0 ; j < 9 ;j++) {
                board[i][j] = input.nextInt();
            }
        }
        return board;
    }
    public static boolean[][] findFreeSpaces(int[][] board) {
        //FIND FREE SPACES IN GIVEN ARRAY; RETURNS ARRAY OF BOOLEANS FOR THIER CORRESPONDING VALUES
        boolean[][] free_spaces = boolean[9][9];
        for(int i = o ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if(board[i][j] != 0) {
                    free_spaces[][] = false;
                }
            }
        }
    }
    //public static void solver(int[][] board) {
        //CYCLE THROUGH THE FREE SPACES IN THE GIVEN ARRAY; TRY EACH NUMBER
        //CALLS isValid() TO DETERMINE IF IT IS A VALID NUMBER
    //}
    //public static boolean isValid() {
        //CHECK IF EACH NUMBER IN LOCATION FOLLOWS RULES
            //CHECKS ROW
            //CHECKS COLUMNS
            //CHECKS SQUARES
    //}
    //public static boolean checkRows(int row , int column , int value) {
        //CHECK ROWS 
    //}
    //public static boolean checkColumns(int row , int column , int value) {
        //CHECK COLUMNS
    //}
    //public static boolean checkSquare(int row , int column , int value) {
        //CHECK SQUARES
    //}
    //public static void printBoard(int[][] board){
        //PRINT THE FOUND ARRAY IF ALL NUMBERS ARE TRUE    
    //}
}