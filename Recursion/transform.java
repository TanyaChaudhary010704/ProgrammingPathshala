import java.util.*;

public class transform {
  private static boolean helper(long a, long b,List<Long> temp) {
    if (a > b) {
      temp.remove(temp.size()-1);
      return false;
    }
    if (a == b) {
      return true;
    }
    temp.add(a * 2);
    boolean left = helper(a * 2, b, temp);
    temp.add(10*a+1);
    boolean right = helper(10 * a + 1, b, temp);
    if (!(right|| left)) {
      temp.remove(temp.size()-1);
    }
    return left || right;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    List<Long> temp = new ArrayList<>();
    temp.add(a);
    boolean ans = helper(a, b, temp);
    if (ans) {
      System.out.println("YES");
      System.out.println(temp.size());
      for (int i = 0; i < temp.size();i++) {
        System.out.print(temp.get(i)+" ");
      }
    }
    else {
      System.out.println("NO");
    }
    sc.close();
  }
}
