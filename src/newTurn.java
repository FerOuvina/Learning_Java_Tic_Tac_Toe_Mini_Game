import java.util.Scanner;

public class newTurn {
  boolean invalidInput = false;

  public boolean setTurn (String[] board, Scanner scanner, String turn) {
	System.out.println("\n" + "Is the turn of player: " + turn);
	System.out.println("Please choose where would you like to place your mark...");
	int userInput = scanner.nextInt();

	if (board[userInput - 1].equals("x") || board[userInput - 1].equals("o")) {
	  System.out.println("The chosen spot is already taken...");
	  System.out.println("Please choose another spot...");
	  userInput = scanner.nextInt();
	  board[userInput - 1] = turn;
	  new drawBoard(board);

	  if (board[userInput - 1].equals("x") || board[userInput - 1].equals("o")) {
		System.out.println("The chosen spot is already taken...");
		System.out.println("Please choose another spot...");
		userInput = scanner.nextInt();
		board[userInput - 1] = turn;
		new drawBoard(board);

		if (board[userInput - 1].equals("x") || board[userInput - 1].equals("o")) {
		  System.out.println("The chosen spot is already taken...");
		  System.out.println("Ending game due to invalid user inputs...");
		  return invalidInput = true;
		}
	  }
	} else {
	  board[userInput - 1] = turn;
	  new drawBoard(board);
	}
	return invalidInput;
  }
}
