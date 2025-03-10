import java.util.*;
public class LexographicSs {
  public static void printss(int[] arr, int idx, ArrayList<Integer> temp) {
    System.out.println(temp);
    if (idx >= arr.length) {
      return;
    }
    for (int i = idx; i < arr.length; i++) {
      temp.add(arr[i]);
      printss(arr, i + 1, temp);
      temp.remove(temp.size() - 1);
    }
  }
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    //sort if not sorted
    printss(arr, 0,new ArrayList<>());
  }
}
