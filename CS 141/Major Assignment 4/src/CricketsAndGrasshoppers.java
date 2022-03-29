import java.util.Scanner;
import java.util.*;

// Jared Howard

public class CricketsAndGrasshoppers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String p1Won = "Crickets win!";
		String p2Won = "Grasshoppers win!";

		boolean playing = true;
		int piecesPerPlayer = promptNumberReadLine(s, "Please enter the number of pieces for each player (1-10): ", 10);
		int spacesInMiddle = promptNumberReadLine(s, "Please enter the number of spaces in the middle (1-9): ", 9);
		int[] board = createBoard(piecesPerPlayer, spacesInMiddle);
		int player = 1;
		while (canMove(board, player)) {
			String playingBoard = boardToString(board);
			print(playingBoard);
			if (player == 1) {
				int player1Move = promptNumberReadLine(s, "Crickets, please enter your move (1-" + board.length + "): ",
						board.length);
				if (isMoveValid(board, 1, player1Move)) {
					move(board, 1, player1Move);
					player = 2;
				} else {
					System.out.println("That space does not contain a piece you can move! Please try again. ");
				}
			}
			else {
				int player2Move = promptNumberReadLine(s,
						"Grasshoppers, please enter your move (1-" + board.length + "): ", board.length);
				if (isMoveValid(board, 2, player2Move)) {
					move(board, 2, player2Move);
					player = 1;
				} else {
					System.out.println("That space does not contain a piece you can move! Please try again. ");
				}
			}
		}
		if (player == 1) {
			print(p2Won);
		}
		else {
			print(p1Won);
		}
	}

	// method to print out an array for testing
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	// method to print out my board string during gameplay
	public static void print(String s) {
		System.out.println(s);
	}

	static int[] boardInputs = new int[2];
	public static int promptNumberReadLine(Scanner s, String prompt, int max) {

		while (true) {
			System.out.print(prompt);
			if (!s.hasNextInt()) {
				System.out.println("That was not a valid number! Please try again.");
				s.nextLine();
			}
			else {
				int input = s.nextInt();
				s.nextLine();
				if (input < 1 || input > max) {
					System.out.println("That was not a valid number! Please try again.");
				} else {
					return input;
				}
			}
		}
	}
	public static int[] createBoard(int piecesPerPlayer, int spacesInMiddle) {
		int boardSize = ((piecesPerPlayer * 2) + spacesInMiddle);
		int[] board = new int[boardSize];
		for (int i = 0; i < piecesPerPlayer; i++) {
			board[i] = 1;
		}
		for (int i = piecesPerPlayer; i < spacesInMiddle + piecesPerPlayer; i++) {
			board[i] = 0;
		}
		for (int i = (piecesPerPlayer + spacesInMiddle); i < boardSize; i++) {
			board[i] = 2;
		}
		return board;
	}

	public static String boardToString(int[] board) {
		String newBoard = "";
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 1) {
				newBoard += "C";
			}
			if (board[i] == 0) {
				newBoard += ".";
			}
			if (board[i] == 2) {
				newBoard += "G";
			}
		}
		return newBoard;
	}

	public static boolean isMoveValid(int[] board, int player, int position) {
		//turns input into index of array
		position = position - 1;
		if (position >= board.length || position < 0) {
			return false;
		}
		if (board[position] != player) {
			return false;
		}
		if (player == 1) {
			if (position == board.length - 1) {
				return false;
			}
			if (position == board.length - 2 && board[position + 1] != 0) {
				return false;
			}
			if ((board[position + 1] == 2) && (board[position + 2] == 0)) {
				return true;
			}
			if (board[position + 1] == 0) {
				return true;
			}
		}
		if (player == 2) {
			if (position == 0) {
				return false;
			}
			if (position == 1 && board[position - 1] != 0) {
				return false;
			}
			if ((board[position - 1] == 1) && (board[position - 2] == 0)) {
				return true;
			}
			if (board[position - 1] == 0) {
				return true;
			}
		}
		return false;
	}

	public static int findIndexP2(int[] array, int number) {
		for (int i = array.length - 1; i > -1; i--) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}

	public static int findIndexP1(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}

	public static int[] indexer(int[] array, int number, int pieces) {
		int[] needle = new int[pieces];
		int[] indexArray = new int[pieces];
		for (int i = 0; i < array.length; i++) {
			indexArray[i] = findIndexP1(array, number);

			if (needle.equals(indexArray)) {

			}
		}
		return indexArray;
	}

	public static boolean canMove(int[] board, int player) {
			for (int i = 1; i <= board.length; i++) {
				if (isMoveValid(board, player, i)) {
					return true;
				}
			}
		return false;
	}

	public static boolean move(int[] board, int player, int position) {
			if (!isMoveValid(board, player, position)) {
				return false;
			}
			position = position - 1;
			if (player ==1) {
				if (board[position + 1] == 0) {
					board[position] = 0;
					board[position + 1] = 1;
					return true;
				} else {
					board[position] = 0; 
					board[position + 2] = 1; 
					return true;
				}
			}
			if (player == 2) {
				if (board[position - 1] == 0) {
					board[position] = 0;
					board[position - 1] = 2;
					return true;
				} else {
					board[position] = 0;
					board[position - 2] = 2;
					return true;
				}
			}
		return true;
	}
}
