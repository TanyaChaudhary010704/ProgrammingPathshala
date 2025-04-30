public class digitDP {
  public static int count(int idx, boolean tight,String s) {
    if (idx >= s.length()) {
      return 1;
    }
    int min = 0;
    int max = tight ? s.charAt(idx) - '0' : 9;
    int ans = 0;
    for (int i = min; i <= max; i++) {
      ans += count(idx + 1, tight && (i == max), s);
    }
    return ans;
  }
  public static void main(String[] args) {
    String s = "2556";
    System.out.println(count(0, true, s));
  }
}
