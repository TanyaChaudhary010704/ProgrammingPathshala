import java.util.ArrayList;
public class max2Instances {
  public static void helper(int[] arr, int i, ArrayList<Integer> list) {
    if (i == arr.length) {
      System.out.println(list);
      return;
    }
    helper(arr, i + 1, list);
    list.add(arr[i]);
    helper(arr, i + 1, list);
    list.add(arr[i]);
    helper(arr, i + 1, list);
    list.remove(list.size()-1);
    list.remove(list.size()-1);
  }
  public static void main(String[] args) {
    int[] arr = { 1, 2 };
    ArrayList<Integer> list = new ArrayList<Integer>();
    helper(arr, 0, list);
  }
}