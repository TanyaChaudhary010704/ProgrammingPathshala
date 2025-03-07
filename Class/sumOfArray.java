public class sumOfArray {
  public static int sum(int[] arr, int i, int j) {
    //tc- o(n)
    //sc=o(logn)
    if (i == j) {
      return arr[i];
    }
    int mid =( i + j )/ 2;
    int leftsum = sum(arr, i, mid);
    int rightsum = sum(arr, mid + 1, j);
    return leftsum + rightsum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 1, 2 };
    System.out.println(sum(arr,0,arr.length-1));
  }
}
