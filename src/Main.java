import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
	String[] board = new String[9];
	Scanner scanner = new Scanner(System.in);
	String turn = "x";
	Boolean winner = false;
	for (int i = 0; i < board.length; i++) {
	  board[i] = String.valueOf(i + 1);
	}

	new drawBoard(board);

	System.out.println("\n" + "Starting game...");
	System.out.println("Is the turn of player: " + turn);
	System.out.println("Please select the number where you like to place your mark...");
	int userInput = scanner.nextInt();
	board[userInput - 1] = turn;

	new drawBoard(board);
  }


}

