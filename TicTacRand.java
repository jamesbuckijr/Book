import java.lang.Math;//import random number generator
    
public class TicTacRand {
    /** Generates a tic-tac-toe board with randomly filled 1s and 0s; prints it; and finds rows, columns, or diagonal wins */
    public static void main (String[] args) {
    //call methods
        tests();
        
    }
    public static void tests() {//run tests on all methods
        System.out.println(randOneZero());//randomy prints 1 or 0
        System.out.println("TEST");
        int[][] test_board = ticTacBoard();
        printArray(test_board);
        threeInARow(test_board);
    }    
    public static int randOneZero() { 
        //method that generates random number either 1 or 0
        double random_number = Math.random();
        int rand_int = (random_number >= .50) ? 1 : 0;
        return rand_int;
    }
    public static int[][] ticTacBoard() {
        //generate 3 X 3 board; two dimensional array
        int[][] board = new int[3][3];
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[i].length; j++) {
                board[i][j] = (int)randOneZero();
            }
        }
        return board;
    }
    public static void printArray(int[][] array) {
        //Processes an array and prints out each row and column
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }    
    public static void threeInARow( int[][] board ) {
        //method to find winning ones or zeros; prints winning rows, columns, and diagonals
        //checks top left with all adjacent; top right with middle
        //SIMPLIFY INTO LOOP/SWITCH STATEMENT; MUST BE MORE INTELLEGENT WAY
        for (int i = 0 ; i < board[0].length ;i++) {//cycle through first row/column
            if (board[0][i] == board[1][i]) { //test columns
                if (board[0][i] == board[2][i]) {
                    System.out.println("There is a match in column " + (i + 1) + ":" + board[0][i] + "'s");
                }
            }
            if (board[i][0] == board[i][1]) {//test rows
                if (board[i][0] == board[i][2]) {
                    System.out.println("There is a match in row " + (i + 1) + ": " + board[i][0] + "'s");
                }
            }
        }
        if (board[0][0] == board[1][1]) {//TEST diagonals
            if (board[0][0] == board[2][2]) {
                System.out.println("There is a match in the left right diagonal: " + board[0][0] + "'s");
            }
        }
        if (board[0][2] == board[1][1]) {
            if (board[0][2] == board[2][0]) {
                System.out.println("There is a match in the right left diagonal: " + board[0][2] + "'s");
            }
        }
    }
}