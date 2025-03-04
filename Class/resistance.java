import java.util.Scanner;
public class resistance {
  public static long countResistors(long a, long b) {
    if (a == 0 || b == 0)
      return 0;
    if (a >= b) {
      return a / b + countResistors(a % b, b);
    }
    return b / a + countResistors(a, b % a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    System.out.println(countResistors(a, b));
  }
}
