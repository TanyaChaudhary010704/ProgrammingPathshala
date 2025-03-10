

public class printParenthesis {
  public static void pp ( int n, int l ,int r ,int idx,char[] s){
    if (idx == 2 * n) {
      System.out.println(s);
      return;
    }
    if (l == r) {
      s[idx] = '(';
      pp(n, l+1, r, idx + 1, s);
    }
    if (l > r) {
      if (l == n) {
        s[idx] = ')';
        pp(n, l, r+1, idx + 1, s);
      }
      else {
        s[idx]='(';
        pp(n, l + 1, r, idx + 1, s);
        s[idx] = ')';
        pp(n, l, r+1, idx+1, s);
      }
    }
  }
  public static void main(String[] args) {
    int n = 3;
    pp(n, 0, 0, 0, new char[2*n]);
  }
}
