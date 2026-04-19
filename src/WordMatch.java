public class WordMatch {

  private final String secret;

  public WordMatch(String word) {
    this.secret = word;
  }

  public int scoreGuess(String guess) {
    int count = 0; // number of occurences
    int guessLength = guess.length();
    for (int i = 0; i < secret.length() - guessLength + 1; i++) {
      String sub = secret.substring(i, i + guessLength);
      if (sub.equals(guess)) {
        count++;
      }
    }
    return count * guessLength * guessLength;
  }
}
