/*
Approach->
1-> map the key values with the key or 2D array

*/
public class LetterCombination {
  public static void letterComb(String digits, char[][] digitMap, String temp, int idx) {
    if (idx >= digits.length()) {
      System.out.println(temp);
      return;
    }
    for (int j = 0; j < digitMap[digits.charAt(idx) - '2'].length; j++) {
      letterComb(digits, digitMap, temp + digitMap[digits.charAt(idx) - '2'][j], idx + 1);
    }
  }

  public static void main(String[] args) {
    char[][] digitMap = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
        { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
    System.out.println("Letter Combinations");
    letterComb("23", digitMap, "", 0);
  };
}
