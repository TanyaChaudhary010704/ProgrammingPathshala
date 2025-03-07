
import java.util.*;

public class StarSky {
  public static void print(int[][] mat){
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat[i].length; j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  
  public static int[][] updateBrightness(int[][] starMatrix, int t, int c) {
    for (int k = 0; k < t; k++) {
      for (int l = 0; l < 100; l++) {
        for (int m = 0; m < 100; m++) {
          if (starMatrix[l][m] + 1 > c) {
            starMatrix[l][m] = 0;
          }
          else{
            starMatrix[l][m] += 1;
          }
        }
      }
    }
    return starMatrix;
  }
  
  public static long[][] prefixSum(int[][] mat) {
    long[][] sum = new long[mat.length][mat[0].length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 1; j < mat[i].length; j++) {
        sum[i][j] += mat[i][j - 1];
      }
    }
    for (int i = 1; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        sum[i][j] += mat[i - 1][j];
      }
    }
    return sum;
  }

  public static long sumRegion(long[][] ps ,int row1, int col1, int row2, int col2) {
    long sum = 0;
    sum = ps[row2][col2];
    if (row1 - 1 >= 0) {
      sum -= ps[row1 - 1][col2];
    }
    if (col1 - 1 >= 0) {
      sum -= ps[row2][col1 - 1];
    }
    if (row1 - 1 >= 0 && col1 - 1 >= 0) {
      sum += ps[row1 - 1][col1 - 1];
    }
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//no. of stars
    int q = sc.nextInt();//no. of views
    int c = sc.nextInt();//max brightness
    int stars[][] = new int[n][3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        stars[i][j] = sc.nextInt();
      }
    }
    //view description t,r1,c1,r2,c2
    int[][] view = new int[q][5];
    for (int i = 0; i < q; i++) {
      for (int j = 0; j < 5; j++) {
        view[i][j] = sc.nextInt();
      }
    }

    int starMatrix[][] = new int[100][100];
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        starMatrix[i][j] = -1;
      }
    }
    
    for (int[] s : stars) {
      starMatrix[s[0]][s[1]] = s[2];
    }
    //print(starMatrix);

    for (int i = 0; i < q; i++) {
      // for (int j = 0; j < 5; j++) {
        int t = view[i][0];
        int r1 = view[i][1];
        int c1 = view[i][2];
        int r2 = view[i][3];
        int c2 = view[i][4];
        starMatrix = updateBrightness(starMatrix, t % c, c);
        //print(starMatrix);
        for (int k = 0; k < 100; k++) {
          for (int l = 0; l < 100; l++) {
            if (starMatrix[k][l] == -1) {
              starMatrix[k][l] = 0;
            }
          }
        }
        long[][] ps = prefixSum(starMatrix);
        //print(ps);
        long sum = 0;
        sum = sumRegion(ps, r2, c1, r1, c2);
        System.out.println(sum);
      // }
      
    }
  }
}
