public class Microwave {

  private final int initialTemp;  // A
  private final int targetTemp;   // B
  private final int frozenRate;   // C
  private final int thawTime;     // D
  private final int normalRate;   // E

  // constructor to be written

  Microwave(int a, int b, int c, int d, int e) {
    initialTemp = a;
    targetTemp = b;
    frozenRate = c;
    thawTime = d;
    normalRate = e;
  }

  /**
   * Returns the total time required to heat the meat from initialTemp to targetTemp.
   */
  public int calculateTime() {
    int time = 0;
    int currentTemp = initialTemp;
    boolean is_frozen = initialTemp < 0;

    while (true) {
      if (currentTemp >= targetTemp) {
        break;
      }

      if (currentTemp < 0 && is_frozen) {
        time += frozenRate;
        currentTemp += 1;
      } else if (currentTemp == 0 && is_frozen) {
        time += thawTime;
        is_frozen = false;
      } else {
        time += normalRate;
        currentTemp += 1;
      }
    }

    return time;
  }
}