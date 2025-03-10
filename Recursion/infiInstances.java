public class infiInstances {
  public static int countss(int[] arr , int sum,int i){
    if (sum < 0)
      return 0;
    if (sum == 0) {
      return 1;
    }
    if(i==arr.length){
      return 0;
    }
    return countss(arr, sum - arr[i], i)+countss(arr, sum, i+1);
  }
  public static void main(String[] args) {
    int arr[] = { 1, 2,3 };
    int sum = 4;
    System.out.println(countss(arr, sum, 0));
  }
}