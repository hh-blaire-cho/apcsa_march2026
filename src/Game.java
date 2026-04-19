public class Game {

  private final Level levelOne;
  private final Level levelTwo;
  private final Level levelThree;
  private final boolean isBonus;

  public Game(Level l1, Level l2, Level l3, boolean bonus) {
    levelOne = l1; // (true, 200)
    levelTwo = l2; // (true, 100)
    levelThree = l3; // (true, 500)
    isBonus = bonus;
  }

  public boolean isBonus() {
    return isBonus;
  }

  public int getScore() {
    int score = 0;
    if (levelOne.goalReached()) {
      score += levelOne.getPoints();
    }
    if (levelOne.goalReached() && levelTwo.goalReached()) {
      score += levelTwo.getPoints();
    }
    if (levelOne.goalReached() && levelTwo.goalReached() && levelThree.goalReached()) {
      score += levelThree.getPoints();
    }
    if (isBonus) {
      score *= 3;
    }
    return score;
  }

//  public void playRandom() { /* implementation not shown. */ }
//
//  public int playRandomManyTimes(int num) { /* implementation not shown. */ }

// there may be instances variables, constructors, and methods that are not shown.
}