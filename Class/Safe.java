package Class;

import java.util.*;
import java.util.ArrayList;

public class Safe {

  static ArrayList<String> list = new ArrayList<>();

  public static void generatePasswards(String s, int same, int i) {
    if (i >= s.length() && same == 0) {
      list.add(s);
      return;
    } else if (i >= s.length()) {
      return;
    }
    if (same != 0) {
      generatePasswards(s, same - 1, i + 1);
    }
    if (s.charAt(i) == '0') {
      s = s.substring(0, i) + '1' + s.substring(i + 1);
    } else if (s.charAt(i) == '1') {
      s = s.substring(0, i) + '0' + s.substring(i + 1);
    }
    generatePasswards(s, same, i + 1);
  }

  public static boolean verify(String s1, String s2, int k) {
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == s2.charAt(i)) {
        count += 1;
      }
    }
    return count == k;
  }

  public static ArrayList<String> filter(ArrayList<String> list, String s, int c, ArrayList<String> temp) {
    for (String curr : list) {
      if (verify(curr, s, c)) {
        temp.add(curr);
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    String s = sc.next();
    int c = sc.nextInt();
    generatePasswards(s, c, 0);
    // System.out.println(list);
    m--;
    while (m > 0) {
      String s2 = sc.next();
      int c2 = sc.nextInt();
      list = filter(list, s2, c2, new ArrayList<String>());
      m--;
    }
    System.out.println(list.size());
    sc.close();
  }
}
