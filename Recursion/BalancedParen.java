public class BalancedParen {
  public static void paren2(int n,int m, int lp, int rp,int lb, int rb, int i, char[] s) {
    if (i == 2 *(n+m)) {
      System.out.println(s);
      return;
    }
    if (lp == rp && lb == rb) {
      s[i] = '(';
      paren2(n, m, lp + 1, rp, lb, rb, i + 1, s);
      s[i] = '{';
      paren2(n, m, lp, rp, lb + 1, rb, i + 1, s);
    } 
     else if (lp > rp) {
      if (lp == n) {
        s[i] = ')';
        paren2(n, lp, rp + 1, i + 1, s);
      } else {
        s[i] = '(';
        paren2(n, lp + 1, rp, i + 1, s);
        s[i] = ')';
        paren2(n, lp, rp + 1, i + 1, s);
      }
    }
  }
  
  public static void paren(int n, int l, int r, int i, char[] s) {
    if (i == 2 * n) {
      System.out.println(s);
      return;
    }
    if (l == r) {
      s[i] = '(';
      paren(n, l + 1, r, i + 1, s);
    }
    else if (l > r) {
      if (l == n) {
        s[i] = ')';
        paren(n, l, r + 1, i + 1, s);
      }
      else {
        s[i] = '(';
        paren(n, l + 1, r, i + 1, s);
        s[i] = ')';
        paren(n, l, r+1, i+1, s);
      }
    }
  }

  public static void main(String[] args) {
    // int n = 3;
    // char[] s = new char[2*n];
    // paren(n, 0, 0, 0, s);
    int n = 1;
    int m = 2;
    char[] s = new char[2*(n+m)];
    paren2(n,m, 0, 0,0,0, 0, s);
    

  }
}