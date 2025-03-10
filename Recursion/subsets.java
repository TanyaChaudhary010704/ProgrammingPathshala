
import java.util.ArrayList;
import java.util.List;
public class subsets {
  static ArrayList<Integer> list = new ArrayList<Integer>();
  static int[] arr = { 1, 2, 3 };

  public static List<List<Integer>> subsetsUsingBitmasking(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < (1 << n); i++) {
      List<Integer> subset = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) > 0) {
          subset.add(nums[j]);
        }
      }
      result.add(subset);
    }
    return result;
  }
  
  public static void generateSubsets(ArrayList<Integer> list, int idx) {
    if (idx >= arr.length) {
      System.out.println(list);
      return;
    }
    list.add(arr[idx]);
    generateSubsets(list, idx + 1);
    list.remove(list.size() - 1);
    generateSubsets(list, idx + 1);
  }
  
  public static void main(String[] args) {
    generateSubsets(list, 0);
    System.out.println(subsetsUsingBitmasking(arr));
  }
}
