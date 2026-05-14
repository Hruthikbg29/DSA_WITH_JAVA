package mq;

import java.util.*;

public class Nqueens {

    // Check if it is safe to place queen
    public static boolean isSafe(int row, int col, char[][] board) {

        // Check horizontal (left side only)
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Upper right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Save board configuration
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                row += board[i][j];
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    // Recursive function
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';

                helper(board, allBoards, col + 1);

                board[row][col] = '.'; // backtracking
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoards, 0);

        return allBoards;
    }

    // MAIN METHOD WITH INPUT
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Total Solutions: " + solutions.size());
        System.out.println();

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }

        sc.close();
    }
}
