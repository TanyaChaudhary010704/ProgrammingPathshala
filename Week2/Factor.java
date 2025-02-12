public class Factor {
  public static void factors(int n) {
    //o(n)
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println(n);
  }

  public static void factors2(int n) {
    //factors are symmetrical about sqrt(n)
    //o(sqrt(n))
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        if (i * i == n) {
          System.out.print(i + " ");
        } else {
          System.out.print(i + " ");
          System.out.print(n / i + " ");
        }
      }
    }
    System.out.println();
  }
  public static void numOfFactors(int n) {
    //return true if even number of factors else false
    // approach - if perfect sq then even factors ie 2x+1 else 2x ie odd
    int val = (int)Math.sqrt(n);
    if (val * val == n)
      System.out.println("Even");
    else {
      System.out.println("Odd");
    }
  }
  public static void main(String[] args) {
    factors(10);
    factors2(16);
    numOfFactors(16);
    numOfFactors(10);
  }
}