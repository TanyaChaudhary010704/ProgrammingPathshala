// we can take right or bottom move in n*m grid and have to reach destination . REturn number of possible ways to reach there
public class DistinctPath {
  public static int ways(int n, int m, int i, int j) {
    if (i == n - 1 || j == m - 1) {
      return 1;
    }
    int right = ways(n, m, i + 1, j);
    int bottom = ways(n, m, i, j + 1);
    return right + bottom;
  }

  static int count = 0;

  public static void ways2(int n, int m, int i, int j) {
    if (i == n - 1 || j == m - 1) {
      count++;
      return;
    }
    ways2(n, m, i + 1, j);
    ways2(n, m, i, j + 1);
  }

  public static void main(String[] args) {
    // System.out.println(ways(3, 3, 0, 0));
    ways2(3, 3, 0, 0);
    System.out.println(count);
  }
}
