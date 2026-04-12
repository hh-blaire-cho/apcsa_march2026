public class WorkSchedule {

  private final int workFatigue;   // A
  private final int workAmount;    // B
  private final int restRecovery;  // C
  private final int maxFatigue;    // M

  // constructor to be written
  WorkSchedule(int workFatigue, int workAmount, int restRecovery, int maxFatigue) {
    this.workFatigue = workFatigue;
    this.workAmount = workAmount;
    this.restRecovery = restRecovery;
    this.maxFatigue = maxFatigue;
  }

  /**
   * Simulates a 24-hour period and returns the maximum amount of work that can be completed without exceeding
   * maxFatigue.
   */
  public int getMaxWork() {
    // to be implemented
    int fatigue = 0;
    int worked = 0;

    for (int i = 0; i < 24; i++) {
      if (fatigue + workFatigue <= maxFatigue) {
        fatigue += workFatigue;
        worked += workAmount;
      } else {
//        fatigue -= restRecovery;
//        if (fatigue < 0) {
//          fatigue = 0;
//        }
        fatigue = Math.max(0, fatigue - restRecovery);
      }
    }
    return worked;
  }
}