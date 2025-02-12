//there are n doors initally closed . play n rounds and in ith round toggle doors that are multiple of i
public class OpenClosePrblm {
  public static void main(String[] args) {
    int n = 5;
    //5 doors 5 rounds
    //to open- toggle odd no. of times
    //no of times toggled == no of factors of that number
    //to open - ith door should be prefect sq
    //to find total open doors = find no. of perfect sq till n
    int prefectSquares = (int)Math.sqrt(n);
    System.out.println(prefectSquares);
  }
}
