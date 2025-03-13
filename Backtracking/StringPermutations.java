package Backtracking;

public class StringPermutations {

  public static char[] rightRotate(char[] s, int k) {
    int n = s.length;
    char ans[] = new char[n];
    for (int i = 0; i < n; i++) {
      ans[(i + k) % n] = s[i];
    }
    return ans;
  }
  
  public static void permute(char[] s, int i) {
    if (i == s.length) {
      System.out.println(s);
      return;
    }
    for (int j = i; j < s.length; j++) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      permute(s, i + 1);
      temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }
  }
  
  public static void permute2(char[] s, int i) {
    if (i == s.length) {
      System.out.println(s);
      return;
    }
    for (int j = i; j < s.length; j++) {
      int k = s.length - j + i;
      s = rightRotate(s, k);//right rotate
      permute2(s, i + 1);//recurse
      s = rightRotate(s, s.length - k);//left rotate
    }
  }
  
  public static void permute3(char[] s, int i) {
    if (i == s.length) {
      System.out.println(s);
      return;
    }
    int freq[] = new int[26];
    for (int j = i; j < s.length; j++) {
      if(freq[s[j]-'a']==0){
        freq[s[j] - 'a'] = 1;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        permute3(s, i + 1);
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
      }
    }
  }
  
  public static void main(String[] args) {
    // String s = "ABC";
    // permute2(s.toCharArray(), 0);
    String s = "aab";
    permute3(s.toCharArray(), 0);
  }
}
