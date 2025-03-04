public class Toh {
  public static void toh(int n, String src, String medium, String dest) {
    if (n == 1) {
      System.out.println(src + "->" + dest);
      return;
    }
    toh(n - 1, src, dest, medium);
   System.out.println(src+"->"+dest); 
   toh(n-1,medium,src,dest); 
  }

  public static void main(String[] args) {
    int n = 3;
    toh(n,"A","B","C");
  }
}