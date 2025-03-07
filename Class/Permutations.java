
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Permutations {
  static List<List<Integer>> result;

  public static void permute3(int[] arr, int idx) {
    if (idx == arr.length - 1) {
      List<Integer> temp = new ArrayList<>();
      for (int a : arr) {
        temp.add(a);
      }
      result.add(new ArrayList<>(temp));
    }
    HashMap<Integer, Boolean> map = new HashMap<>();
    for (int i = idx; i < arr.length; i++) {
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], true);
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
        permute3(arr, idx + 1);
        temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
      }
    }
  }
  
  public static void permute2(int[] arr, int idx) {
    if (idx == arr.length - 1) {
      List<Integer> temp = new ArrayList<>();
      for (int a : arr) {
        temp.add(a);
      }
      result.add(new ArrayList<>(temp));
    }
    for(int i=idx;i<arr.length;i++){
      int temp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = temp;
      permute2(arr, idx + 1);
      temp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = temp;
    }
  }

  public static void permute(int[] arr, int idx, List<Integer> temp) {
    if (temp.size() == arr.length) {
      result.add(new ArrayList<Integer>(temp));
      return;
    }
    for (int i = 0; i <= temp.size(); i++) {
      temp.add(i, arr[idx]);
      permute(arr, idx + 1, temp);
      temp.remove(i);
    }
  }
  
  public static void main(String[] args) {
    int[] arr = { 1,1, 2};
    result = new ArrayList<>();
    // permute(arr, 0, new ArrayList<>());
    // System.out.println(result);
    // permute2(arr, 0);
    // System.out.println(result);
    
    permute3(arr, 0);
    System.out.println(result);
  }
}
