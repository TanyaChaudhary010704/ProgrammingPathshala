import java.util.ArrayList;
import java.util.List;

public class TohGFG {
  static List<Integer> result ;
    static int count=0;

    static void toh(int N, int n, int a, int b, int c) {
      if (N == 1) {
        count++;
        if (count == n) {
          result.add(a);
          result.add(c);
        }
        return;
      }

      toh(N - 1, n, a, c, b);
      toh(1, n, a, b, c);
      toh(N - 1, n, b, a, c);
    }
    public static void main(String[] args) {
      result = new ArrayList<>();
      count = 0;
      toh(4,5,1,2,3);
     System.out.println(result);
    }
}
