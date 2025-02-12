import java.util.Arrays;
public class PrimeNumber {
  public static boolean isPrime(int n) {
    //0(sqrt(n))
    if (n == 1)
      return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  //prime numbers in range
  public static void PrimeRange(int n) {
    //0(n*sqrt(n))
    for (int j = 2; j <= n; j++) {
      int count = 0;
      for (int i = 2; i * i <= j; i++) {
        if (j % i == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        System.out.println(j);
      }
    }
  }

  public static void PrimeRange2(int n) {
    // algo - sieve of eratosthens
    //0(n*log(log(n))
    //sc = o(n)
    //cut 1
    //assume first non cut number in next range is prime
    //cut all multiples of that prime number 
    //repeat the process
    //sum of reciprocals of prime from 1 to n is log(log(n))
    boolean[] arr = new boolean[n + 1];
    Arrays.fill(arr, true);
    arr[1] = false;
    for (int i = 2; i * i <= n; i++) {
      if (arr[i] == true) {
        for (int j = i; j * i <= n; j++) {
          arr[j * i] = false;
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      if (arr[i]) {
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args) {
    //prime number - having 2 distinct divisors
    //System.out.println(isPrime(11));
    //PrimeRange(10);
    PrimeRange2(100);
  }
}
