public class Array2D {

  public static void print(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] multiplyTwo(int[][] arr1, int[][] arr2) {
    int n = arr1.length;
    int m = arr1[0].length;
    int p = arr2[0].length;
    int[][] result = new int[n][p];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < p; j++) {
        for (int k = 0; k < m; k++) {
          result[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return result;
  }

  public static int[][] sumTwo(int[][] arr1, int[][] arr2) {
    int n = arr1.length;
    int m = arr1[0].length;
    int[][] arr3 = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr3[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return arr3;
  }

  public static void findMaxFromRandom(int n, int m) {
    int[][] arr = createRandom(n, m);

    int maxi = 0;
    int maxj = 0;
    int maxval = arr[0][0];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] > maxval) {
          maxi = i;
          maxj = j;
          maxval = arr[i][j];
        }
      }
    }

    print(arr);
    System.out.println(maxi + " " + maxj);
    System.out.println(maxval);
  }


  public static int[][] createRandom(int n, int m) {
    int[][] array = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = (int) (Math.random() * 10) + 1;
      }
    }
    return array;
  }

  public static int[][] mirrorVertical(int[][] oarr) {
    int n = oarr.length;
    int m = oarr[0].length;
    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[n - i - 1][j] = oarr[i][j];
      }
    }
    return arr;
  }

  public static int[][] mirrorHorizontal(int[][] oarr) {
    int n = oarr.length;
    int m = oarr[0].length;
    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][m - j - 1] = oarr[i][j];
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    System.out.println("-----------");
    System.out.println("random array of 4 by 3");
    int[][] randomarr = createRandom(4, 3);
    print(randomarr);
    System.out.println("-----------");
    System.out.println("find max val and its position of random array");
    findMaxFromRandom(10, 10);
    System.out.println("-----------");
    System.out.println("mirror Vertical");
    int[][] flipped1 = mirrorVertical(randomarr);
    print(flipped1);
    System.out.println("-----------");
    System.out.println("mirror Horizontal");
    int[][] flipped2 = mirrorHorizontal(randomarr);
    print(flipped2);

    int[][] mat1 = {{2, 0}, {1, 3}};
    int[][] mat2 = {{4, 1, 2}, {0, 5, 6}};
    System.out.println("-----------");
    System.out.println("sum two");
    print(mat1);
    System.out.println("+");
    print(mat2);
    System.out.println("=");
    print(sumTwo(mat1, mat2));

    System.out.println("-----------");
    System.out.println("multiply two");
    print(mat1);
    System.out.println("*");
    print(mat2);
    System.out.println("=");
    print(multiplyTwo(mat1, mat2));

  }
}
