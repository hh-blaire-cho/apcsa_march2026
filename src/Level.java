public class Level {

  private final int points;
  private final boolean goalReached;

  Level(int points, boolean goalReached) {
    this.points = points;
    this.goalReached = goalReached;
  }


  public boolean goalReached() {
    return goalReached;
  }

  public int getPoints() {
    return points;
  }

// there may be instances variables, constructors, and methods that are not shown.
}