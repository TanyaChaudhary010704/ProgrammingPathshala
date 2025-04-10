package DesignPatterns.TicTacToeGame;

public class Move {
  private final int row;
  private final int col;

  public Move(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public int getCol() {
    return this.col;
  }

  public int getRow(){
    return this.row;
  }
}
