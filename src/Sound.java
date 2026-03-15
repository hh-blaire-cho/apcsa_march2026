public class Sound {

  private int[] samples;

  // setSamples is not required for test.
  // I just made this for testing / debug purpose.
  public void setSamples(int[] samples) {
    this.samples = samples;
  }

  public int limitAmplitude(int limit) {
    int count = 0;

    for (int i = 0; i < samples.length; i++) {
      if (samples[i] > limit) {
        samples[i] = limit;
        count++;
      } else if (samples[i] < -1 * limit) {
        samples[i] = -1 * limit;
        count++;
      }
    }
    return count;
  }

  public void trimSilenceFromBeginning() {
    int idx = 0;
    for (int i = 0; i < samples.length; i++) {
      if (samples[i] != 0) {
        idx = i; // record starting point of the sound
        break;
      }
    }

    int[] trimmedSamples = new int[samples.length - idx];

    for (int i = 0; i < trimmedSamples.length; i++) {
      trimmedSamples[i] = samples[i + idx];
      System.out.print(trimmedSamples[i] + " "); // not required but just for testing purpose.
    }

    samples = trimmedSamples;

  }
}
