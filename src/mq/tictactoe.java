package mq;

import java.util.Scanner;

public class tictactoe {
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = ' ';
			}
		}

		char player = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner(System.in);

		while (!gameOver) {
			printBoard(board);
			System.out.println("Player :  " + player + " : Enter :");
			int row = sc.nextInt();
			int col = sc.nextInt();

			if (board[row][col] == ' ') {
				board[row][col] = player; // place the element
				gameOver = haveWon(board, player);
				if (gameOver) {
					System.out.println("Player : " + player + " : Has Won ! ");
				} else {
					if (isBoardFull(board)) {
						System.out.println("Board is full! It's a draw! Restart the game.");
						gameOver = true; // End the game
					} else {
						player = (player == 'X') ? 'O' : 'X';
					}
				}
			} else {
				System.out.println("Invalid move. Try Again !");
			}
		}
		printBoard(board);
		
	}

	public static boolean haveWon(char[][] board, char player) {
		// check the row
		for (int row = 0; row < board.length; row++) {
			if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
				return true;
			}
		}
		// check the col
		for (int col = 0; col < board.length; col++) {
			if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
				return true;
			}
		}
		// diagonal
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}

		return false;

	}

	public static void printBoard(char[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " | ");
			}
			System.out.println();
		}
	}

	public static boolean isBoardFull(char[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == ' ') {
					return false; // Found an empty space
				}
			}
		}
		return true; // No empty spaces found
	}
}
