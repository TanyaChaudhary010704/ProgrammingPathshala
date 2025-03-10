import java.util.ArrayList;

public class countss {
  public static int helper(int[] arr, int sum, int idx) {
    if (idx == arr.length) {
      if (sum == 0) {
        return 1;
      }
      return 0;
    }
    int x = 0;
    if (sum - arr[idx] >= 0) {
      x = helper(arr, sum - arr[idx], idx + 1);
    }
    x += helper(arr, sum, idx + 1);
    return x;
  }
  public static void main(String[] args) {
    int[] arr = { 1,2,5,4 };
    int sum = 6;
    int ans = helper(arr, sum, 0);
    System.out.println(ans);
  }
}
