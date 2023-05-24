public class checkWinner {
  public checkWinner (String[] board, Boolean winner, String turn) {
	if (board[0].equals("x") && board[1].equals("x") && board[2].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[3].equals("x") && board[4].equals("x") && board[5].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[6].equals("x") && board[7].equals("x") && board[8].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[0].equals("x") && board[3].equals("x") && board[6].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[1].equals("x") && board[4].equals("x") && board[7].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[2].equals("x") && board[5].equals("x") && board[8].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[0].equals("x") && board[4].equals("x") && board[8].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	} else if (board[2].equals("x") && board[4].equals("x") && board[6].equals("x")) {
	  winner = true;
	  System.out.println("Game over, the winner is the player: " + turn);
	}
  }
}
