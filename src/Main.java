import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
	String[] board = new String[9];
	String turn = "x";
	Scanner scanner = new Scanner(System.in);
	for (int i = 0; i < board.length; i++) {
	  board[i] = String.valueOf(i + 1);
	}

	newTurn nextTurn = new newTurn();
	setWinner getWinner = new setWinner();

	for (int i = 0; i < 9; i++) {
//	  First Board Draw
	  if (i == 0) {
		System.out.println("\n" + "Starting game...");
		new drawBoard(board);
	  }

//	  Check user input and winner
	  nextTurn.setTurn(board, scanner, turn);
	  getWinner.checkWinner(board, turn);

//	  if invalid input is true end game
	  if (nextTurn.invalidInput) {
		return;
	  }

//	  if winner then end game
	  if (getWinner.winner) {
		System.out.println("Game over, the winner is the player: " + turn);
		return;
	  }

//	  Change turns
	  if (turn.equals("x")) {
		turn = "o";
	  } else turn = "x";


	}


  }
}

