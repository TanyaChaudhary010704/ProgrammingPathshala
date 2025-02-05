import java.util.*;
//https://codeforces.com/problemset/problem/855/B
public class MarvoloGauntsRing {
  // public static void print(int[] arr){
  // for (int i = 0; i < arr.length; i++) {
  // System.out.print(arr[i]);
  // }
  // System.out.println();
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long p = sc.nextLong();
    long q = sc.nextLong();
    long r = sc.nextLong();
    long arr[] = new long[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextLong();
    }
    // print(arr);
    long pma[] = new long[n];
    pma[0] = p * arr[0];
    for (int i = 1; i < n; i++) {
      pma[i] = Math.max(pma[i - 1], p * arr[i]);
    }
    // print(pma);
    long sma[] = new long[n];
    sma[n - 1] = r * arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      sma[i] = Math.max(sma[i + 1], r * arr[i]);
    }
    // print(sma);
    long sum = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      long curr = pma[i] + (q * arr[i]) + sma[i];
      sum = Math.max(curr, sum);
    }
    System.out.println(sum);
  }
}