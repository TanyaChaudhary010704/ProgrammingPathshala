//Tprime if number has 3 distinct divisors
import java.util.Arrays;
import java.util.Scanner;

public class Tprime {
  public static boolean[] primeInRange(int n) {
    boolean[] arr = new boolean[n + 1];
    Arrays.fill(arr, true);
    arr[0] = false;
    arr[1] = false;
    for (int i = 2; i<= n; i++) {
      if (arr[(int)i] == true) {
        for (int j = i; (long)j * i <= n; j++) {
          arr[(int)(long)j * i] = false;
        }
      }
    }
    return arr;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long arr[] = new long[n];
    long max = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextLong();
      max = Math.max(max, arr[i]);
    }
    int maxRoot = (int) Math.ceil( Math.sqrt(max));
    boolean primes[] = primeInRange(maxRoot);
    for (int i = 0; i < n; i++) {
      long root = (long) Math.sqrt(arr[i]);
      if (root*root==arr[i] && primes[(int)root]) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}