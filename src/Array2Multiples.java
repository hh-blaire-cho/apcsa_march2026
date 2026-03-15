public class Array2Multiples {

  public static int[][] buildMatrix(int[] arr, int cols) {
    int[][] matrix = new int[arr.length][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = arr[i] * (j + 1);
      }
    }
    return matrix;
  }

  public static int[][] eliminateDuplicateRows(int[][] arrWithDups) {
    int cols = arrWithDups[0].length;
    int[] uniqueNumbers = new int[arrWithDups.length];
    int uniqueCount = arrWithDups.length;
    for (int i = 0; i < arrWithDups.length; i++) {
      uniqueNumbers[i] = arrWithDups[i][0];
      for (int j = 0; j < i; j++) {
        if (uniqueNumbers[i] == uniqueNumbers[j]) {
          uniqueNumbers[i] = 0;
          uniqueCount--;
          break;
        }
      }
    }

    int[][] matrix = new int[uniqueCount][cols];
    int k = 0;
    for (int i = 0; i < uniqueNumbers.length; i++) {
      if (uniqueNumbers[i] == 0) {
        continue;
      }
      for (int j = 0; j < cols; j++) {
        matrix[k][j] = uniqueNumbers[i] * (j + 1);
      }
      k++;
    }
    return matrix;
  }

  public static void main(String[] args) {

    // print to see if arr2 is correct
    System.out.println("Part A");
    int[] arr = {7, 6, 2, 6};
    int[][] arr2 = buildMatrix(arr, 5);
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // print to see if arr3 is correct
    System.out.println("Part B");
    int[][] arr3 = eliminateDuplicateRows(arr2);
    for (int i = 0; i < arr3.length; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(arr3[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

}
