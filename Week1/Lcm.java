public class Lcm {
  public static int lcm1(int x, int y) {
    int i;
    for (i = Math.max(x, y); i <= x * y; i++) {
      if (i % x == 0 && i % y == 0) {
        break;
      }
    }
    return i;
  }

  public static int gcd(int x, int y) {
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

  public static int lcm2(int[] arr) {
    //gcd*lcm = x*y
    int lcm = lcm1(arr[0], arr[1]);
    for (int i = 2; i < arr.length; i++) {
      lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);
    }
    return lcm;
  }
  //find count of elements which are either divisible by a or b or both
  // ans = n/a+n/b-n/lcm(a,b)
  //find count of elements which are either divisible by a or b or c or both
  // ans = n/a+n/b+n/c-n/lcm(a,b)-n/lcm(b,c)-n/lcm(a,c)+n/lcm(a,b,c)
  public static void main(String[] args) {
    System.out.println(lcm1(12, 18));
    int arr[] = { 12, 18, 9 };
    System.out.println(lcm2(arr));
    
  }
}
