public class RollCake {

  private final int length; // initialized at the beginning
  private final int numSpectators; // initialized at the beginning
  private final int[][] intervals; // initialized at the beginning

  RollCake(int length, int[][] intervals) {
    this.length = length;
    this.intervals = intervals;
    numSpectators = intervals.length;
  }

  /**
   * intervals[i] contains the request [P, K] for spectator i+1
   */
  public int expectedMax() {
    int maxl = 0;
    int maxi = 0;
    for (int i = 0; i < numSpectators; i++) {
      int a = intervals[i][0];
      int b = intervals[i][1];
      if (b - a > maxl) {
        maxl = b - a;
        maxi = i;
      }
    }
    return maxi;
  }

  public int actualMax() {
    int[] arr = new int[length + 1];
    int maxl = 0;
    int maxi = 0;
    for (int i = 0; i < numSpectators; i++) {
      int a = intervals[i][0];
      int b = intervals[i][1];
      int realcnt = 0;
      for (int j = a; j <= b; j++) {
        if (arr[j] == 0) { // if not taken
          arr[j] = 1; // mark from me
          realcnt++;
        }
      }
      if (realcnt > maxl) {
        maxl = realcnt;
        maxi = i;
      }
    }
    return maxi;
  }
}