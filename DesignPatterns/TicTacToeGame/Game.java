package DesignPatterns.TicTacToeGame;

public class Game {

  private final Player player1;
  private final Player player2;
  private final Board board;

  public Game(Player player1, Player player2, Board board) {
    this.player1 = player1;
    this.player2 = player2;
    this.board = board;
  }

  Result start() {
    Player currentPlayer = this.player1;
    while (!this.board.isFull()) {
      Move currentMove = currentPlayer.play();
      this.board.applyMove(currentMove, currentPlayer.getSymbol());
      this.board.showBoard();
      if (this.board.hasWinningLine(currentPlayer.getSymbol())) {
        System.out.println("Game is up....");
        return new Result(false, currentPlayer);
      }
      if (currentPlayer == this.player1) {
        currentPlayer = this.player2;
      } else {
        currentPlayer = this.player1;
      }
    }
    return new Result(true, null);
  }
}
