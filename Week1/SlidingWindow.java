public class SlidingWindow {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int n = arr.length;
    int k =3;
    int ksum = 0;
    for (int i = 0; i < k; i++) {
      ksum += arr[i];
    }
    for (int i = 1 ; i < n - k + 1; i++) {
      System.out.println(ksum);
      ksum += arr[i+k-1];
      ksum -= arr[i - 1];
    }
    System.out.println(ksum);
    
  }
}
