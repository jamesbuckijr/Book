import java.util.Scanner;

public class SudokuSolver {
    //FIX SOLVER METHOD
        //HOW THE APP CYCLES THROUGH THE EMPTY SPACES
    /** Takes input row by row for a sudoku puzzle and returns the solution in the form of an array  */
    public static void main(String[] args) {
        tests();
    }
    public static void tests() {
        int[][] test_board_complete = {
            {5,3,4,6,7,8,9,1,2},
            {6,7,2,1,9,5,3,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},
            {4,2,6,8,5,3,7,9,1},
            {7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,1,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}             
                                 };
        int[][] test_board_partial = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,0,0,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        boolean[][] test_free_spaces_array = findFreeSpaces(test_board_partial);
        System.out.println("TESTS");
        //getBoard();//WORKING
        printTwoDimensionalArray(findFreeSpaces(test_board_partial));
        System.out.println(checkRows(test_board_complete, 0, 1));//RETURN TRUE
        System.out.println(checkRows(test_board_partial, 0, 1));//RETURN FALSE
        System.out.println(checkColumns(test_board_complete , 0 , 1));//RETURN TRUE
        System.out.println(checkColumns(test_board_partial , 0 , 1));//RETURN FALSE
        System.out.println(checkSquares(test_board_complete , 4 , 6 , 1));//RETURN TRUE
        System.out.println(checkSquares(test_board_partial , 6 , 6 , 1));//RETURN FALSE
        System.out.println(isValid(test_free_spaces_array, test_board_partial, 1, 1 , 5 ));//PRINT FALSE
        System.out.println("TESTS COMPLETE");
    }
    public static int[][] getBoard() {
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
    public static int[][] findFreeSpaces(int[][] board) {
        //return coordinates of free spaces in board
        //FIND FREE SPACES IN GIVEN ARRAY
        int count = 0;
        for(int i = 0 ; i < 9 ; i++){for(int j = 0 ; j < 9 ; j++){if(board[i][j] == 0){count++;}}}
        int[][] free_spaces = new int[count][2];
        int location = 0;
        for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if(board[i][j] == 0) {
                    free_spaces[location][0] = i;
                    free_spaces[location][1] = j;
                }
            }
        }
        return free_spaces;
    }
    public static /*int[][]*/void solver(int[][] board) {
        //NEW
        int[][] free_spaces = findFreeSpaces(board);
        int current_free_space = 0;
        boolean valid_guess = isValid(board, free_spaces[current_free_space][0] , free_spaces[current_free_space][1] , test_value );
        test_value = 1;
        
            
    }
    public static boolean isValid(int[][] board , int row, int column, int test_value) {
        //CHECK IF EACH NUMBER IN LOCATION FOLLOWS RULES
        if(checkRows(board, row , test_value) == true)//CHECKS ROW
            if(checkColumns(board, column, test_value) == true)//CHECKS COLUMNS
                if(checkSquares(board , row , column , test_value) == true)//CHECKS SQUARES
                    return true;
        return false; 
    }
    public static boolean checkRows(int[][] board, int row, int test_number) {
        //CHECK ROWS for same number
        boolean number_present = false;
        for (int i = 0 ; i < 9 ; i++) {
            if (board[row][i] == test_number) {
                number_present = true;
                break;
            }
        }
        return number_present;
    }
    public static boolean checkColumns(int[][] board, int column, int test_number) {
        //CHECK COLUMNS if test number is present
        boolean number_present = false;
        for (int i = 0 ; i < 9 ; i++) {
            if (board[i][column] == test_number) {
                number_present = true;
                break;
            }
        }
        return number_present;
    }
    public static boolean checkSquares(int[][] board, int row , int column , int test_number) {
        //CHECK THE APPRORIATE SQUARE FOR INSTANCE OF GIVEN NUMBER
        int square_row = 0;
        int square_column = 0;
        if (row > 2) 
            square_row = (row >= 3 && row < 6) ? 3 : 6;//conditional assignment
        if (column > 2)
            square_column = (column >= 3 && column < 6) ? 3 : 6;//conditional assignment
        boolean number_present = false;
        for (int i = 0 ; i < 3 ;i++) {
            for ( int j = 0 ; j < 3 ; j++) {
                if (board[i + square_row][j + square_column] == test_number) {
                    number_present = true;
                    break;
                }
            }
        }
        return number_present;
    }
    public static void printTwoDimensionalArray(boolean[][] array) {
        //Processes an array and prints out each row and column
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.printf("%-6b " , array[i][j]);
            }
            System.out.print("\n");
        }
    } 
    public static void printTwoDimentionalArray(int[][] array) {
        //Processes an array and prints out each row and column
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.printf("%-1d",array[i][j]);
            }
            System.out.print("\n");
        }
    }       
}