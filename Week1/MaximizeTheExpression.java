import java.util.Scanner;

public class MaximizeTheExpression {

//we are given an array of integers, we need to maximize the expression
   // p*arr[i]+q*arr[j]+r*arr[k] where i<j<k
public static void main(String[] args){
//we need to keep a middle element
       //left of that we need to find prefix max
       //right of that we need to find suffix max
       // pmax[i-1] + arr[i] + smax[i+1]

int[] arr = {12,14,3,7,8,90}; //this way no need to declare size of array, dynamic initialization
int n = arr.length;
       int sum=0;

       Scanner sc= new Scanner(System.in);
       int p=sc.nextInt();
       int q=sc.nextInt();
       int r=sc.nextInt();

       int[] prefixMax = new int[n]; //o(n) to populate it
prefixMax[0] = p*arr[0];
       for(int i=1;i<n;i++){
           prefixMax[i]=Math.max(prefixMax[i-1],p*arr[i]);
       }

       int[] suffixMax = new int[n]; //o(n) to populate it
suffixMax[n-1] = r*arr[n-1];
       for(int i=n-2;i>=0;i--){
           suffixMax[i]=Math.max(suffixMax[i+1],r*arr[i]);
       }

//first and last element will not be the middle elements for sure
for(int i=1;i<n-1;i++){ //o(n) to find the sum
int current_sum= q*arr[i] + prefixMax[i-1] + suffixMax[i+1];
           sum=Math.max(sum,current_sum);
       }
       System.out.println(sum);
   }
}