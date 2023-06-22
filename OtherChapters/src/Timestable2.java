import java.util.Scanner;

public class Timestable2 {

    private static final int SIZE = 9;

    public static void main(String[] args) {
        int[][] board = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");
        for (int row = 0; row < SIZE; row++) {
            System.out.print("Enter numbers for row " + (row + 1) + ": ");
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = scanner.nextInt();
            }
        }

        System.out.println("Sudoku puzzle:");
        printBoard(board);

        if (solveSudoku(board)) {
            System.out.println("\nSudoku solved:");
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Check row and column
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 grid
        int gridRow = (row / 3) * 3;
        int gridCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[gridRow + i][gridCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
