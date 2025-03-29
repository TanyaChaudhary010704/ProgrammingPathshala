//package Backtracking;
import java.util.*;

public class CountPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();

    int n = s.length();

    int[][] isPal = new int[n][n];
    //initializing with true
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        isPal[i][j] = 1;
      }
    }
    //fill upper triangle diagonally
    for (int x = 1; x < n; x++) {
      int i = 0, j = x;
      while (i < n && j < n) {
        isPal[i][j] = isPal[i + 1][j - 1]==1 && s.charAt(i) == s.charAt(j)? 1:0;
        i++;
        j++;
      }
    }
    //filing false in lower triangle
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        isPal[i][j] = 0;
      }
    }
    //storing sum in upper last cell of perticular triangle
    for(int i=0;i<n;i++){
      for(int j=1;j<n;j++){
        isPal[i][j] += isPal[i][j - 1];
      }
    }
    for (int j = 0; j < n; j++) {
      for (int i = n - 2; i >= 0; i--) {
        isPal[i][j] += isPal[i + 1][j];
      }
    }
    
    while(q-- >0){
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(isPal[l-1][r-1]);
    }
    
  }
}