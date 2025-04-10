package DesignPatterns.TicTacToeGame;

public class TicTacToe {
  public static void main(String[] args) {
    System.out.println(" --------Game Started------ ");
    Game game = new Game(new Player('X'), new Player('O'), new Board());
    Result result = game.start();
    if (result.isDraw()) {
      System.out.println("Draw");
    } else {
      System.out.println(result.getWinner().getSymbol() + " won...");
    }
    System.out.println("_____________________");
  }
}
