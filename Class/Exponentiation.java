public class Exponentiation {
  public static float power(int x, int y) {
    if(y==0){
      return 1;
    }
    float pow = power(x,y/2);
    if(y%2==0){
      return pow*pow;
    }
    return pow*pow*x;
  }

  public static void main(String[] args) {
    int x = 2;
    int y = -3;
    float ans = power(x, Math.abs(y));
    if (y < 0) {
      ans = 1 / ans;
    }
    System.out.println(ans);
  }
}
