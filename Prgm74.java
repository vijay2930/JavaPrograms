// Java Program to find the product of two matrices


public class Prgm74 {
  public static void main(String[] args) {
    int[][] matrix1 = {{1, 2}, {3, 4}};
    int[][] matrix2 = {{5, 6}, {7, 8}};

    int[][] result = multiplyMatrices(matrix1, matrix2);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
    int rows1 = matrix1.length;
    int cols1 = matrix1[0].length;
    int rows2 = matrix2.length;
    int cols2 = matrix2[0].length;
    if (cols1 != rows2) {
      throw new IllegalArgumentException("Invalid matrices for multiplication");
    }
    int[][] result = new int[rows1][cols2];
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols2; j++) {
        for (int k = 0; k < cols1; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }
    return result;
  }
}
