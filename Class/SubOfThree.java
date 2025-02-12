package Class;
//find number of subsequences of length 3 which are palindromes
//using meet in the middle approach 
public class SubOfThree {
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr ={1,2,3,1,2,4};
    int[] preFreq = new int[10];
    int[] suFreq = new int[10];
    //preFreq[arr[0]] = 1;
    for (int i = 1; i < arr.length; i++) {
      suFreq[arr[i]] += 1;
    }
    //print(preFreq);
    //print(suFreq);
    int count = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      preFreq[arr[i-1]]++;
      suFreq[arr[i]]--;
      for (int j = '0'; j <= '9'; j++) {
        int x = preFreq[j-'0'];
        int y = suFreq[j-'0'];
        count += (x * y);
      }
    }
    System.out.println(count);
  }
}
