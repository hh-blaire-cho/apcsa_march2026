public class GameRunner {

  public static void main(String[] args) {
    Level l1 = new Level(200, true);
    Level l2 = new Level(100, true);
    Level l3 = new Level(500, true);
    Game game1 = new Game(l1, l2, l3, true);

    System.out.println(game1.getScore()); // 2400

    Level l4 = new Level(200, true);
    Level l5 = new Level(100, true);
    Level l6 = new Level(500, false);
    Game game2 = new Game(l4, l5, l6, false);

    System.out.println(game2.getScore()); // 300
  }

}
