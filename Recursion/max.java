

public class max {
  public static int findMax(int[] arr, int i, int j) {
    if (i == j) {
      return arr[i];
    }
    int mid = (i + j) / 2;
    return Math.max(findMax(arr, i, mid),findMax(arr, mid+1, j));
  }
  public static void main(String[] args) {
    int[] arr = {7,1,4,3,2,6,5};
    System.out.println(findMax(arr, 0,arr.length-1));
  }
}
