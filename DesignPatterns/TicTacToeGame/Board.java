package DesignPatterns.TicTacToeGame;

public class Board {
  private final char[][] board;

  public Board() {
    this.board = new char[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        this.board[i][j] = '.';
      }
    }
  }

  public void showBoard() {
    for (int i = 0; i < 3; i++) {
      System.out.println(" ------------- ");
      for (int j = 0; j < 3; j++) {
        System.out.print(" | " + this.board[i][j]);
      }
      System.out.println(" | ");
    }
    System.out.println(" ------------- ");
  }

  public void applyMove(Move move, char symbol) {
    this.board[move.getRow()][move.getCol()] = symbol;
  }

  public boolean hasWinningLine(char symbol) {
    return hasHorizontalWinningLine(symbol) || hasVerticalWinningLine(symbol) || hasDiagonalWinningLine(symbol);
  }

  public boolean hasHorizontalWinningLine(char symbol) {
    for (int i = 0; i < 3; i++) {
      if (this.board[i][0] == symbol && this.board[i][1] == symbol && this.board[i][2] == symbol) {
        return true;
      }
    }
    return false;
  }

  public boolean hasVerticalWinningLine(char symbol) {
    for (int j = 0; j < 3; j++) {
      if (this.board[0][j] == symbol && this.board[1][j] == symbol && this.board[2][j] == symbol) {
        return true;
      }
    }
    return false;
  }

  public boolean hasDiagonalWinningLine(char symbol) {
    return (this.board[0][0] == symbol && this.board[1][1] == symbol && this.board[2][2] == symbol)
        || (this.board[0][2] == symbol && this.board[1][1] == symbol && this.board[2][0] == symbol);
  }

  public boolean isFull() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (this.board[i][j] == '.') {
          return false;
        }
      }
    }
    return true;
  }

}
