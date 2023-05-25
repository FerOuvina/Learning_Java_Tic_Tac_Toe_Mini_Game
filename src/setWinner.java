public class setWinner {
  boolean winner = false;

  public boolean checkWinner (String[] board, String turn) {
	if (board[0].equals(turn) && board[1].equals(turn) && board[2].equals(turn)) {
	  return winner = true;
	} else if (board[3].equals(turn) && board[4].equals(turn) && board[5].equals(turn)) {
	  return winner = true;
	} else if (board[6].equals(turn) && board[7].equals(turn) && board[8].equals(turn)) {
	  return winner = true;
	} else if (board[0].equals(turn) && board[3].equals(turn) && board[6].equals(turn)) {
	  return winner = true;
	} else if (board[1].equals(turn) && board[4].equals(turn) && board[7].equals(turn)) {
	  return winner = true;
	} else if (board[2].equals(turn) && board[5].equals(turn) && board[8].equals(turn)) {
	  return winner = true;
	} else if (board[0].equals(turn) && board[4].equals(turn) && board[8].equals(turn)) {
	  return winner = true;
	} else if (board[2].equals(turn) && board[4].equals(turn) && board[6].equals(turn)) {
	  return winner = true;
	}
	return winner;
  }
}
