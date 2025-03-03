package Class;
import java.util.ArrayList;
public class subsets {
  static ArrayList<Integer> list = new ArrayList<Integer>();
  static int[] arr = { 1, 2, 3 };
  public static void generateSubsets(ArrayList<Integer> list,int idx) {
    if (idx >= arr.length){
      System.out.println(list);
      return;
  }
    list.add(arr[idx]);
    generateSubsets(list, idx + 1);
    list.remove(list.size() - 1);
    generateSubsets(list, idx+1);  
  }
  public static void main(String[] args) {
    generateSubsets(list, 0); 
  }
}
