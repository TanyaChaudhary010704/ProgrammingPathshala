import java.util.*;
public class FlyingSaucer {
  public static long power(long x, long y,long mod) {
    if(y==0){
      return 1;
    }
    long pow = power(x,y/2,mod)%mod;
    if(y%2==0){
      return (pow*pow)%mod;
    }
    return (pow*pow*(x%mod))%mod;
  }
 public static void main(String[] args) {
   //ans = 3**n-1
   Scanner sc = new Scanner(System.in);
   long n = sc.nextLong();
   long m = sc.nextLong();
   long ans = power(3, n, m);
   System.out.println((ans - (1%m)+m)%m);
   sc.close();
 } 
}
