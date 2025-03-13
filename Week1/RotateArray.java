public class RotateArray {
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int[] rotateArray1(int[] arr, int n, int k) {
    //tc-o(n*k)
    for (int i = 0; i < k; i++) {
      int temp = arr[n - 1];
      for (int j = n - 2; j >= 0; j--) {
        arr[j + 1] = arr[j];
      }
      arr[0] = temp;
    }
    return arr;
  }

  public static int[] rotateArray2(int[] arr, int n, int k) {
    //tc-o(n) and sc-o(n)
    int ans[] = new int[n];
    for (int i = 0; i < n; i++) {
      ans[(i + k ) % n] = arr[i];
    }
    return ans;
  }
  
  public static int[] rotateArray3(int[] arr, int n, int k) {
    //tc-o(n) and sc-o(1)
    //double reverse
    for (int i = 0; i < (n-k)/2; i++) {
      int temp = arr[i];
      arr[i] = arr[n-k-1-i];
      arr[n-k - i-1] = temp;
    }
    print(arr);
    int j=1;
    for (int i = n-k; i < (n-k+n)/2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - j];
      arr[n - j] = temp;
      j++;
    }
    print(arr);
    for (int i = 0; i < n/2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - 1 - i];
      arr[n - i-1] = temp;
    }
    return arr;
    
  }
  public static void main(String[] args) {
    
    int arr[] = { 1, 2, 3, 4, 5, 6,7,8 };
    int n = arr.length;
    int k = 2;
    // int ans1[] = rotateArray1(arr,n,k%n);
    // print(ans1);
    // int ans2[] = rotateArray2(arr,n,k%n);
    // print(ans2);
    int ans3[] = rotateArray3(arr,n,k%n);
    print(ans3);
  }
}
