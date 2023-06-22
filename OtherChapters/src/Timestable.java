import java.util.Arrays;
import java.util.Random;

public class Timestable {
    private static final int SIZE = 9;

    public static void main(String[] args) {
        int[][] board = generateSudokuBoard();
        printBoard(board);
    }

    private static int[][] generateSudokuBoard() {
        int[][] board = new int[SIZE][SIZE];
        Random random = new Random();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                int num;
                do {
                    num = random.nextInt(SIZE) + 1;
                } while (!isValid(board, row, col, num));
                board[row][col] = num;
            }
        }

        return board;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            System.out.println(Arrays.toString(board[row]));
        }
    }
}

