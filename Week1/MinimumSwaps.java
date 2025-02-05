public class MinimumSwaps {
  public static void main(String[] args) {
    int arr[] = { 2, 7, 9,5,6, 7, 4 };
    int n = arr.length;
    int k = 5;
    //we have to tell min swaps needed to bring all elements <=k together
    //count the number of elements <=k
    int windowSize = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] <= k) {
        windowSize++;
      }
    }
    int maxLegalCount = 0;
    int count=0;
    for (int i = 0; i < windowSize; i++) {
      if(arr[i]<=k){
        count++;
      }
    }
    maxLegalCount=count;
    for (int i = windowSize; i <n; i++) {
      if (arr[i - windowSize] <= k) {
        count--;
      }
      if (arr[i ] <= k) {
        count++;
      }
      maxLegalCount = Math.max(maxLegalCount, count);
    }
    int minSwaps = windowSize - maxLegalCount;
    System.out.println(minSwaps);
  }
}
