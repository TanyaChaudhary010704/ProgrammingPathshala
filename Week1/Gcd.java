public class Gcd {
  public static int gcd1(int x, int y) {
    int ans = 1;
    int i = Math.min(x, y);
    for (; i >= 1; i--) {
      if (x % i == 0 && y % i == 0) {
        ans = i;
        break;
      }
    }
    return ans;
  }

  public static int gcd2(int x, int y) {
    //tc = o(log(n))
    //euclids gdc algo
    int max = Math.max(x,y);
    int min = Math.min(x, y);
    if (min == 0) {
      return max;
    }
    while(max%min != 0) {
      int temp = max;
      max=min;
      min = temp%min;
    }
    return min;
  }
  public static int gcd3(int x, int y) {
    if (y == 0)
      return x;
    return gcd3(y, x % y);  
  }
  public static int gcd4(int[] arr) {
    //gcd of more nums by picking any two numbers at once
    //if there is a subsequence whose gcd is 1 then we gcd of entire array to be 1
    int gcd = gcd3(arr[0], arr[1]);
    for (int i = 2; i < arr.length; i++) {
      gcd = gcd3(gcd, arr[i]);
    }
    return gcd;
  }
  public static void main(String[] args) {
    System.out.println(gcd1(12,18));
    System.out.println(gcd2(12, 18));
    System.out.println(gcd3(12, 18));
    int arr[] = { 12, 18, 9 };
    System.out.println(gcd4(arr));
  }
}
