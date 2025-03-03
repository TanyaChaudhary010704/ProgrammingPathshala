package Class;
public class code {
  static int count = 0;

  public static void func(int i, int j, int m, int n) {
    count++;
    if (i >= m || j >= n)
      return;
    if (i == m - 1 && j == n - 1) {
      return;
    }
    func(i, j+1, m, n);
    func(i+1, j, m, n);
  }
  public static void main(String[] args) {
    func(0, 0, 3, 3);
    System.out.println(count);
  }
}
