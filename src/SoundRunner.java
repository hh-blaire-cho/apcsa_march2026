public class SoundRunner {

  public static void main(String[] args) {
    Sound sound = new Sound();

    int[] arr1 = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
    sound.setSamples(arr1);
    System.out.println(sound.limitAmplitude(2000)); // result = 5

    int[] arr2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
    sound.setSamples(arr2);
    sound.trimSilenceFromBeginning(); // result = -14 0 -35 -39 0 -7 16 32 37 29 0 0
  }

}
