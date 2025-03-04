

public class SubOfFive {
  public static void main(String[] args) {
    String s = "9999900000";

    int pf[] = new int[10];
    int sf[] = new int[10];
    pf[s.charAt(0) - '0'] = 1;
    sf[s.charAt(s.length()-1) - '0']=1;

    int[][] preFreq = new int[10][10];
    int[][] suFreq = new int[10][10];
    //preFreq[s.charAt(0) - '0'][s.charAt(1) - '0'] = 1;
    for (int i = s.length() - 2; i >= 2; i--) {
      int curr = s.charAt(i)-'0';
      for (int j = 0; j < 10; j++) {
        if (sf[j] > 0) {
          suFreq[curr][j]+=sf[j];
        }
      }
      sf[curr]++;
    }

    int count = 0;
    for (int i = 2; i <= s.length() - 3; i++) {
      for(int l = 0; l <10;l++){
        if(pf[l] > 0) {
          preFreq[l][s.charAt(i - 1) - '0'] += pf[l];
        }
      }
      pf[s.charAt(i - 1) - '0'] ++;
      sf[s.charAt(i) - '0']--;
      for(int l = 0; l <10;l++){
        if(sf[l] > 0) {
          suFreq[s.charAt(i)-'0'][l] -=sf[l];
        }
      }
      
      for (int j = '0'; j <= '9'; j++) {
        for (int k = '0'; k <= '9'; k++) {
          int x = preFreq[j - '0'][k - '0'];
          int y = suFreq[k - '0'][j - '0'];
          count += x * y;
        }
      }
    }
    System.out.println(count);
  }
}
