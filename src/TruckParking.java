public class TruckParking {

  private final int costA;
  private final int costB;
  private final int costC;

  TruckParking(int A, int B, int C) {
    costA = A;
    costB = B;
    costC = C;
  }

  public int calculateCost(int[][] intervals) {
    int[] arr = new int[25]; // 24 + 1
    for (int i = 0; i < 4; i++) {
      int a = intervals[i][0]; // checkin time
      int b = intervals[i][1]; // checkout time
      for (int j = a; j < b; j++) {
        arr[j] += 1;
      }
    }

    int total = 0;
    for (int i = 0; i < 25; i++) {
      if (arr[i] == 1) {
        total += costA;
      } else if (arr[i] == 2) {
        total += costB * 2;
      } else if (arr[i] >= 3) {
        total += costC * arr[i];
      }
    }
    return total;
  }

}
