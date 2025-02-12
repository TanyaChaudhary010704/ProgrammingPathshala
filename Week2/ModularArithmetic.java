/*
x%m = ranges in [0....m-1]
(a+b)%m = rem of sum = ((a%m) + (b%m)) % m
(a*b)%m = rem of sum = ((a%m) * (b%m)) % m
(a-b)%m = ((a%m) - (b%m)) +m)
*/
public class ModularArithmetic {
  //count total number of pairs (i,j) such that arr[i]+arr[j] is div by k

  //Brute force
  public static int countPairs1(int[] arr, int k) {
    int count = 0;
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if ((arr[i] + arr[j]) % k == 0) {
          count++;
          System.out.println("("+arr[i]+","+arr[j]+")");
        }
      }
    }
    return count;
  }
  //optimization1
  public static int countPairs2(int[] arr, int k) {
    //(a+b)%k = ((a%k) + (b%k)) % k==0? when (a%k) + (b%k)==0 or k 
    //if (a%k) + (b%k)=0 then (a%k) = (b%k)=0
    //if (a%k) + (b%k)=k then (a%k) = k-i and (b%k)=i 
    //tc-o(n)
    int n = arr.length;
    int[] mod = new int[k];//o(k)
    for (int i = 0; i < n; i++) {
      mod[arr[i] % k]++;
    }
    int count = 0;
    count += mod[0] * (mod[0] - 1) / 2;
    for (int i = 1; i < k/2; i++) {
      count += mod[i] * mod[k - i];
    }
    if (k % 2 == 0) {
      count += mod[k / 2] * (mod[k / 2] - 1) / 2;
    }
    else {
      count += mod[k/2] * mod[k/2+1];
    }
    return count;
  }
  public static void main(String[] args) {
    int arr[] = { 2, 2, 1, 7, 6, 5, 10 };
    int k = 4;
    System.out.println(countPairs1(arr,k));
    System.out.println(countPairs2(arr,k));
  }
}
