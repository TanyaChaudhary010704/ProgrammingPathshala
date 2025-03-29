import java.util.*;

public class Appartments {
  public static int lowerBound(int x,int y,int i,int j , int arr[]) {
    int idx = -1;
    while (i <= j) {
      int m = (i + j) / 2;
      if (arr[m] < x)
        i = m + 1;
      else if (arr[m] > y)
        j = m - 1;
      else {
        idx = m;
        j = m - 1;
      }
    }
    return idx;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[m];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int curr = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      //find lower and upper bound in b
      int j = lowerBound(a[i] - k,a[i]+k, curr, n - 1, b);
      if (j == -1) {
        continue;
      }
      count++;
      curr = j + 1;
    }
    System.out.println(count);
  }
}
