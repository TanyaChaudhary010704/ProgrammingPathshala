package DesignPatterns.TicTacToeGame;

import java.util.Scanner;

public class Player {
  private char symbol;

  public Player(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return this.symbol;
  }

  public Move play() {
    System.out.println("Enter Move -> ");
    Scanner sc = new Scanner(System.in);
    System.out.print("Row , Col : ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    System.out.println();
    return new Move(row, col);
  }
}
